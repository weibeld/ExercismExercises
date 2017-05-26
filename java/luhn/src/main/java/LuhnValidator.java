import java.util.stream.IntStream;

public class LuhnValidator {

  public boolean isValid(String num) {
    return isValidFormat(num) && isValidLuhn(num);
  }

  private boolean isValidLuhn(String num) {
    int[] d = num.codePoints().filter(Character::isDigit).map(Character::getNumericValue).toArray();
    return IntStream.range(0, d.length)
      .map(i -> isEvenFromRight(i, d.length) ? d[i] : transDigit(d[i]))
      .sum() % 10 == 0;
  }

  private boolean isValidFormat(String num) {
    return num.matches("(\\s*\\d\\s*){2,}");
  }

  private boolean isEvenFromRight(int i, int len) {
    return (len - 1 - i) % 2 == 0;
  }

  private int transDigit(int d) {
    return d < 5 ? d * 2 : d * 2 - 9;
  }

}

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class LuhnValidator {

  public boolean isValid(String num) {
    num = num.replaceAll("\\s+", "");
    return isValidFormat(num) && isValidLuhn(num);
  }

  private boolean isValidLuhn(String num) {
    List<Integer> d = num.chars().mapToObj(Character::getNumericValue).collect(Collectors.toList());
    if (d.size() % 2 != 0) d.add(0, 0);

    return IntStream.range(0, d.size())
      .map(i -> i % 2 == 0 ? transDigit(d.get(i)) : d.get(i))
      .sum() % 10 == 0;
  }

  private boolean isValidFormat(String num) {
    return num.matches("\\d{2,}");
  }

  private int transDigit(int n) {
    return n * 2 > 9 ? n * 2 - 9 : n * 2;
  }

}

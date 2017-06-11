import java.util.Arrays;
import java.util.stream.IntStream;

public class LargestSeriesProductCalculator {

  private int[] digits;

  public LargestSeriesProductCalculator(String str) {
    checkString(str);
    digits = str.codePoints().map(Character::getNumericValue).toArray();
  }

  public long calculateLargestProductForSeriesLength(int length) {
    checkLength(length);
    return IntStream.rangeClosed(0, digits.length-length)
      .mapToLong(i -> Arrays.stream(digits, i, i+length).asLongStream()
        .reduce((n, m) -> n * m).orElse(1)
      ).max().orElse(1);
  }

  private void checkString(String str) {
    if (str == null)
      throw new IllegalArgumentException("String to search must be non-null.");
    if (!str.matches("\\d*"))
      throw new IllegalArgumentException("String to search may only contains digits.");
  }

  private void checkLength(int length) {
    if (length > digits.length)
      throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
    if (length < 0)
      throw new IllegalArgumentException("Series length must be non-negative.");
  }

}

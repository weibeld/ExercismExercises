import java.util.Arrays;
import java.util.stream.IntStream;

public class SumOfMultiples {

  private int mLimit;
  private int[] mBases;

  public SumOfMultiples(int limit, int[] bases) {
    mBases = bases;
    mLimit = limit;
  }

  private int calculateSum() {
    return IntStream.range(1, mLimit).filter(this::isMultiple).sum();
  }

  private boolean isMultiple(int n) {
    return Arrays.stream(mBases).anyMatch(base -> n % base == 0);
  }

  public int getSum() {
    return calculateSum();
  }
    
}

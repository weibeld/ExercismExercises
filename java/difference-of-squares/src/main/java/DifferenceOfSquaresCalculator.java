import java.util.stream.IntStream;

// Note: all public methods return 0 for n < 1
public final class DifferenceOfSquaresCalculator {

  public int computeSquareOfSumTo(int n) {
    return square(IntStream.rangeClosed(1, n).sum());
  }

  public int computeSumOfSquaresTo(int n) {
    return IntStream.rangeClosed(1, n).map(this::square).sum();
  }

  public int computeDifferenceOfSquares(int n) {
    return computeSquareOfSumTo(n) - computeSumOfSquaresTo(n);
  }

  private int square(int n) {
    return n*n;
  }

}

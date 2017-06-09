import java.util.stream.IntStream;

final class NaturalNumber {

  private int mN;

  public NaturalNumber(int number) {
    if (number < 1)
      throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    mN = number;
  }

  public Classification getClassification() {
    int s = IntStream.rangeClosed(1, mN/2).filter(div -> mN % div == 0).sum();
    return s == mN ? Classification.PERFECT :
      s > mN ? Classification.ABUNDANT :
        Classification.DEFICIENT;
  }

}

public class Hamming {

  String mStrand1;
  String mStrand2;

  public Hamming(String strand1, String strand2) {
    if (strand1.length() != strand2.length())
      throw new IllegalArgumentException("DNA strands have unequal length");
    mStrand1 = strand1;
    mStrand2 = strand2;
  }

  public int getHammingDistance() {
    char[] a1 = mStrand1.toCharArray();
    char[] a2 = mStrand2.toCharArray();

    int hammingDistance = 0;
    for (int i = 0; i < a1.length; i++) {
      if ((a1[i] - a2[i]) != 0) hammingDistance++;
    }

    return hammingDistance;
  }

}

import java.util.Arrays;

class Triangle {

  private TriangleKind kind;

  Triangle(double side1, double side2, double side3) throws TriangleException {
    double[] sides = new double[] {side1, side2, side3};
    Arrays.sort(sides);

    if (sides[2] >= sides[0] + sides[1])
      throw new TriangleException();

    switch ((sides[0] == sides[1] ? 1 : 0) + (sides[1] == sides[2] ? 1 : 0)) {
      case 2: kind = TriangleKind.EQUILATERAL; break;
      case 1: kind = TriangleKind.ISOSCELES; break;
      case 0: kind = TriangleKind.SCALENE; break;
    }
  }

  public TriangleKind getKind() {
    return kind;
  }

}

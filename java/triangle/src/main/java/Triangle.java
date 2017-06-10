class Triangle {

  private TriangleKind kind;

  Triangle(double side1, double side2, double side3) throws TriangleException {
    if (side1 <= 0 || side2 <= 0 || side3 <= 0)
      throw new TriangleException();
    else if (!isTriangle(side1, side2, side3))
      throw new TriangleException();
    else if (side1 == side2 && side1 == side3)
      kind = TriangleKind.EQUILATERAL;
    else if (side1 == side2 || side1 == side3 || side2 == side3)
      kind = TriangleKind.ISOSCELES;
    else
      kind = TriangleKind.SCALENE;
  }

  public TriangleKind getKind() {
    return kind;
  }

  private boolean isTriangle(double side1, double side2, double side3) {
    double max = Math.max(side1, Math.max(side2, side3));
    return side1 + side2 + side3 > 2 * max;
  }

}

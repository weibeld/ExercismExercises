public class Matrix {

  private int[][] matrix;

  public Matrix(String str) {
    String[] rows = str.split("\n");
    matrix = new int[rows.length][];

    for (int i = 0; i < rows.length; i++) {
      matrix[i] = rows[i].codePoints()
        .filter(Character::isDigit)
        .map(Character::getNumericValue)
        .toArray();
    }
  }

  public int getRowsCount() {
    return matrix.length;
  }

  public int getColumnsCount() {
    return matrix.length > 0 ? matrix[0].length : 0;
  }

  public int[] getRow(int rowIndex) {
    return matrix[rowIndex];
  }

  public int[] getColumn(int colIndex) {
    int[] col = new int[getRowsCount()];
    for (int i = 0; i < getRowsCount(); i++) {
      col[i] = matrix[i][colIndex];
    }
    return col;
  }

}


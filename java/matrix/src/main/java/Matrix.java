import java.util.Arrays;
import java.util.stream.IntStream;

public class Matrix {

  private int[][] matrix;

  public Matrix(String str) {
    matrix = Arrays.stream(str.split("\n")).map(
        row -> row.codePoints()
        .filter(Character::isDigit)
        .map(Character::getNumericValue)
        .toArray()
      ).toArray(int[][]::new);
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
    return IntStream.range(0, getRowsCount())
      .map(rowIndex -> matrix[rowIndex][colIndex])
      .toArray();
  }

}


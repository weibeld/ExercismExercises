import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.ArrayList;

public class Matrix {

  private List<List<Integer>> matrix = new ArrayList<>();

  public Matrix(String str) {
    String[] rows = str.split("\n");

    for (String row : str.split("\n")) {
      matrix.add(row.codePoints()
        .filter(Character::isDigit)
        .map(Character::getNumericValue)
        .boxed()
        .collect(Collectors.toList()));
    }
  }

  public int getRowsCount() {
    return matrix.size();
  }

  public int getColumnsCount() {
    return matrix.size() > 0 ? matrix.get(0).size() : 0;
  }

  public int[] getRow(int index) {
    return matrix.get(index).stream().mapToInt(x -> x).toArray();
  }

  public int[] getColumn(int index) {
    int[] col = new int[getRowsCount()];
    for (int i = 0; i < getRowsCount(); i++) {
      col[i] = matrix.get(i).get(index);
    }
    return col;
  }
}


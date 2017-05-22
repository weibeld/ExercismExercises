import java.util.HashMap;

public class Scrabble {

  private static final HashMap<Character, Integer> MAP;

  static {
    MAP = new HashMap<Character, Integer>(26);
    MAP.put('a', 1);
    MAP.put('b', 3);
    MAP.put('c', 3);
    MAP.put('d', 2);
    MAP.put('e', 1);
    MAP.put('f', 4);
    MAP.put('g', 2);
    MAP.put('h', 4);
    MAP.put('i', 1);
    MAP.put('j', 8);
    MAP.put('k', 5);
    MAP.put('l', 1);
    MAP.put('m', 3);
    MAP.put('n', 1);
    MAP.put('o', 1);
    MAP.put('p', 3);
    MAP.put('q', 10);
    MAP.put('r', 1);
    MAP.put('s', 1);
    MAP.put('t', 1);
    MAP.put('u', 1);
    MAP.put('v', 4);
    MAP.put('w', 4);
    MAP.put('x', 8);
    MAP.put('y', 4);
    MAP.put('z', 10);
  }

  private int mScore;

  public Scrabble(String word) {
    mScore = calculateScore(word);
  }

  private int calculateScore(String word) {
    if (word == null) return 0;
    int score = 0;
    for (char c : word.toLowerCase().toCharArray()) {
      score += MAP.getOrDefault(c, 0);
    }
    return score;
  }

  public int getScore() {
    return mScore;
  }

}

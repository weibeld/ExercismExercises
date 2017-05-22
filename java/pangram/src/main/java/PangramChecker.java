import java.util.ArrayList;
import java.util.Arrays;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input == null) return false;
        input = input.toLowerCase();
        ArrayList<Character> letters = getLetters();
        for (char c : input.toCharArray()) {
            for (int i = 0; i < letters.size(); i++) {
                if (c == letters.get(i)) {
                    letters.remove(i);
                    break;
                }
            }
            if (letters.isEmpty()) return true;
        }
        return false;
    }

    private ArrayList<Character> getLetters() {
        ArrayList<Character> l = new ArrayList<>();
        l.add('a');
        l.add('b');
        l.add('c');
        l.add('d');
        l.add('e');
        l.add('f');
        l.add('g');
        l.add('h');
        l.add('i');
        l.add('j');
        l.add('k');
        l.add('l');
        l.add('m');
        l.add('n');
        l.add('o');
        l.add('p');
        l.add('q');
        l.add('r');
        l.add('s');
        l.add('t');
        l.add('u');
        l.add('v');
        l.add('w');
        l.add('x');
        l.add('y');
        l.add('z');
        return l;
    }
}

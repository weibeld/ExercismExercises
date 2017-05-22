import java.util.List;
import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

final class HandshakeCalculator {

  public List<Signal> calculateHandshake(int n) {
    int s = Signal.values().length;
    List<Signal> signals = IntStream
                            .range(0, s)
                            .filter(pos -> isBitSet(n, pos))
                            .mapToObj(pos -> Signal.values()[pos])
                            .collect(Collectors.toList());
    if (isBitSet(n, s)) Collections.reverse(signals);
    return signals;
  }

  private boolean isBitSet(int num, int pos) {
    return (1 << pos & num) != 0;
  }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();
        Signal[] signals = Signal.values();

        for (int i = 0; i < signals.length; i++) {
            if (((number >> i) & 1) == 1) {
                handshake.add(signals[i]);
            }
        }

        if ((number & 16) != 0) {
            Collections.reverse(handshake);
        }

        return handshake;
    }
}
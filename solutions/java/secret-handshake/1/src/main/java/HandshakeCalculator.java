import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
    private final Signal[] signals = {
        Signal.WINK, 
        Signal.DOUBLE_BLINK, 
        Signal.CLOSE_YOUR_EYES, 
        Signal.JUMP
    };

    List<Signal> calculateHandshake(int number) {
        List<Signal> handshake = new ArrayList<>();

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

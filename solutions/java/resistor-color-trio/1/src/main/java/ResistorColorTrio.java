import java.util.List;
import java.util.Arrays;

class ResistorColorTrio {
    final List<String> codes = Arrays.asList("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white");

    String label(String[] colors) {
        long ohms = codes.indexOf(colors[0]) * 10 + codes.indexOf(colors[1]);
        int zeros = codes.indexOf(colors[2]);
        ohms = ohms * (long) Math.pow(10, zeros);
        
        if (ohms >= 1_000_000_000) {
            return (ohms / 1_000_000_000) + " gigaohms";
        } else if (ohms >= 1_000_000) {
            return (ohms / 1_000_000) + " megaohms";
        } else if (ohms >= 1_000) {
            return (ohms / 1_000) + " kiloohms";
        } else {
            return ohms + " ohms";
        }
    }
}

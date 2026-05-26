import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HighScores {
    private final List<Integer> scores;

    public HighScores(List<Integer> highScores) {
        this.scores = new ArrayList<>(highScores);
    }

    List<Integer> scores() {
        return List.copyOf(this.scores);
    }

    Integer latest() {
        return this.scores.get(this.scores.size() - 1);
    }

    Integer personalBest() {
        return Collections.max(this.scores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(this.scores);
        Collections.sort(sortedScores, Collections.reverseOrder());
        int count = Math.min(3, sortedScores.size());
        return sortedScores.subList(0, count);
    }

}

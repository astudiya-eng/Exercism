class Scrabble {
    private final int score;

    Scrabble(String word) {
        this.score = calculateScore(word.toUpperCase());
    }

    int getScore() {
        return this.score;
    }

    private int calculateScore(String word) {
        int total = 0;
        for (int i = 0; i < word.length(); i++) {
            total += switch (word.charAt(i)) {
                case 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' -> 1;
                case 'D', 'G' -> 2;
                case 'B', 'C', 'M', 'P' -> 3;
                case 'F', 'H', 'V', 'W', 'Y' -> 4;
                case 'K' -> 5;
                case 'J', 'X' -> 8;
                case 'Q', 'Z' -> 10;
                default -> 0;
            };
        }
        return total;
    }
}
import java.math.BigInteger;

class Grains {
    private final int tabChess = 64;

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > tabChess) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return BigInteger.ONE.shiftLeft(square - 1);
    }

    BigInteger grainsOnBoard() {
        return BigInteger.ONE.shiftLeft(tabChess).subtract(BigInteger.ONE);
    }

}

import java.util.Arrays;

class Matrix {
    private final int[][] matrix;

    Matrix(String matrixAsString) {
        this.matrix = Arrays.stream(matrixAsString.split("\n"))
            .map(row -> Arrays.stream(row.trim().split("\\s+"))
            .mapToInt(Integer::parseInt)
            .toArray())
            .toArray(int[][]::new);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber - 1];
    }

    int[] getColumn(int columnNumber) {
        int[] column = new int[matrix.length];
        for ( int i = 0; i < matrix.length; i++){
            column[i] = matrix[i][columnNumber - 1];
        }
        return column;
    }
}

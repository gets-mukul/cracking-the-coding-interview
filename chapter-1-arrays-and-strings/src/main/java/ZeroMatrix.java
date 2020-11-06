public class ZeroMatrix {
    /**
     * Zero Matrix: Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
     * column are set to 0.
     */

    private final int[][] input =
            {
                    {9, 2, 1, 0, 1},
                    {1, 2, 3, 4, 5},
                    {1, 2, 0, 1, 5},
                    {1, 2, 1, 4, 0}
            };

    private final int m = input.length;
    private final int n = input[0].length;
    private boolean row = false;
    private boolean column = false;

    public void zeroMatrix_1() {
        System.out.println("Before Processing");
        printMatrix();
        checkFirstRowHaveZero();
        checkFirstColumnHaveZero();
        checkForOtherZeros();
        makeCellZeroFromRow();
        makeCellZeroFromColumn();
        makeZeroFromFirstRow();
        makeZeroFromFirstColumn();
        System.out.println("After Processing");
        printMatrix();
    }

    private void printMatrix() {
        for (int[] ints : input) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private void checkFirstRowHaveZero() {
        for (int i = 0; i < n; i++) {
            if (input[0][i] == 0) {
                row = true;
                return;
            }
        }
    }

    private void checkFirstColumnHaveZero() {
        for (int[] value : input) {
            if (value[0] == 0) {
                column = true;
                break;
            }
        }
    }

    private void checkForOtherZeros() {
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (input[i][j] == 0) {
                    input[0][j] = 0;
                    input[i][0] = 0;
                }
            }
        }
    }

    private void makeCellZeroFromRow() {
        for (int i = n - 1; i >= 0; i--) {
            if (input[0][i] == 0) {
                for (int j = 0; j < m; j++) {
                    input[j][i] = 0;
                }
            }
        }
    }

    private void makeCellZeroFromColumn() {
        for (int i = 0; i < m; i++) {
            if (input[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    input[i][j] = 0;
                }
            }
        }
    }

    private void makeZeroFromFirstRow() {
        if (row) {
            for (int i = 0; i < n; i++) {
                input[0][i] = 0;
            }
        }
    }

    private void makeZeroFromFirstColumn() {
        if (column) {
            for (int i = 0; i < m; i++) {
                input[i][0] = 0;
            }
        }
    }
}

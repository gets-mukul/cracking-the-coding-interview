public class RotateMatrix {
    /**
     * Rotate Matrix: Given an image represented by an NxN matrix, where each pixel in the image is 4
     * bytes, write a method to rotate the image by 90 degrees. Can you do this in place?
     */

    private final int[][] input =
            {
                    {11, 12, 13, 14, 15},
                    {16, 17, 18, 19, 20},
                    {21, 22, 23, 24, 25},
                    {26, 27, 28, 29, 30},
                    {31, 32, 33, 34, 35}
            };

    private final int m = input.length;
    private final int n = input[0].length;

    public void rotateMatrix_1() {
        System.out.println("Before Processing");
        printMatrix();
        transposeMatrix();
        swapRows();
        System.out.println("After Processing");
        printMatrix();
    }


    private void transposeMatrix() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <= i / 2; j++) {
                swapIndex(i, j);
            }
        }
    }

    private void printMatrix() {
        for (int[] ints : input) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private void swapIndex(final int i, final int j) {
        int temp = input[i][j];
        input[i][j] = input[j][i];
        input[j][i] = temp;
    }

    private void swapRows() {
        int length = m - 1;
        for (int i = 0; i < m / 2; i++) {
            for (int j = 0; j < m; j++) {
                final int temp = input[j][i];
                input[j][i] = input[j][length];
                input[j][length] = temp;
            }
            length--;
        }
    }

}

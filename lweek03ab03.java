public class lab03 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {6, 5, 6},
            {7, 0, 0}
        };

        int[][] B = {
            {0, 8, 7},
            {6, 9, 4},
            {1, 2, 1}
        };

        int[][] C = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public public class week04lab3 {
    public static void main(String[] args) {

        int[][] A = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int[][] B = {
                { 9, 8, 7 },
                { 6, 5, 4 },
                { 3, 2, 1 }
        };

        int[][] C = new int[3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                C[x][y] = A[x][y] + B[x][y];
                System.out.print(C[x][y]);
            }
            System.out.println();
        }

    }
}

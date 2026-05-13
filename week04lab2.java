public public class week04lab2 {
    public static void main(String[] args) {

        int[][] matrix1 = {
                { 1, 2, 3 },
                { 5, 6, 7 },
                { 2, 4, 6 }
        };
        int[][] transpose = new int[3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                transpose[y][x] = matrix1[x][y];
            }
        }

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.print(transpose[x][y]);
            }
            System.out.println();
        }

    }
}

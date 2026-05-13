public class week04lab4 {

    public static void main(String[] args) {

        int[] score = { 80, 84, 69, 51, 97 };
        double sum = 0;

        for (int x = 0; x < score.length; x++) {
            sum += score[x];
        }

        System.out.print(sum / score.length);

    }
}

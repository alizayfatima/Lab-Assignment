public class lab04 {
    public static void main(String[] args) {
        int[] scores = {85, 90, 60, 92, 77};
        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }

        double average = (double) sum / scores.length;
        System.out.println("The average score is: " + average);
    }
}


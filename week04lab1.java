public class week04lab1 {

    public static void main(String[] args) {

        int[] numbers = { 1, 3, 6, 8, 9, 11, 12 };
        int sum = 0;

        for (int z = 0; z < numbers.length; z++) {
            sum += numbers[z];
        }

        System.out.println(sum);

    }

}
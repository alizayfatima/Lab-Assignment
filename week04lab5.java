public class week04lab5 {
    public static void main(String[] args) {

        int[] numbers = { 34, 71, 12, 98, 45, 23, 109, 23, 112 };
        int z = numbers[0];

        for (int x = 1; x < numbers.length; x++) {
            if (z < numbers[x]) {
                z = numbers[x];
            }
        }

        System.out.println(z);

    }
}

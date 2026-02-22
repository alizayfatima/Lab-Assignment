public class lab08 {
       public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        System.out.print("Before: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int num = arr[i];
            arr[i] = arr[j];
            arr[j] = num;
        }

        System.out.print("After:  ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}

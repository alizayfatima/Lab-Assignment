import java.util.ArrayList;
import java.util.Arrays;

public class week08task4 {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int first = 0;
        int last = arr.size() - 1;

        while (first < last) {
            int i = arr.get(first);
            arr.set(first, arr.get(last));
            arr.set(last, i);

            first++;
            last--;
        }

        System.out.println(arr);

    }
}

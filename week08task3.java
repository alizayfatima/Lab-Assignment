
import java.util.ArrayList;
import java.util.Arrays;

public class week08task3 {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 3, 5, 7));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(2, 4, 6, 8));

        ArrayList<Integer> sortedArray = new ArrayList<>();

        int i = 0, j = 0;

        while (i < array1.size() && j < array2.size()) {
            if (array1.get(i) < array2.get(j)) {
                sortedArray.add(array1.get(i));
                i++;
            } else {
                sortedArray.add(array2.get(j));
                j++;
            }
        }

        while (i < array1.size()) {
            sortedArray.add(array1.get(i));
            i++;
        }

        while (j < array2.size()) {
            sortedArray.add(array2.get(j));
            j++;
        }

        System.out.println(sortedArray);
    }
}

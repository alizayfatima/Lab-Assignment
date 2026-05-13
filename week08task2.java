import java.util.HashMap;

public class week08task2 {
    public static void main(String[] args) {

        int array[] = { 1, 2, 3, 2, 4, 5, 3, 6, 1 };

        HashMap<Integer, Boolean> duplicateInt = new HashMap<>();

        for (int num : array) {
            duplicateInt.put(num, true);
        }
        for (int key : duplicateInt.keySet()) {
            System.out.print(key + ", ");
        }

    }
}
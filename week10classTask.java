import java.util.HashMap;

public class week10classTask {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 2, 4, 5, 3, 3, 6, 1 };

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        for (int key : numMap.keySet()) {
            System.out.println(key + " -> " + numMap.get(key) + " times");
        }
    }
}

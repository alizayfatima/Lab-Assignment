import java.util.ArrayList;

public class week08task1 {
    public static void main(String[] args) {

        int array[] = { 5, -3, 8, -1, 12, -7, 4 };

        ArrayList<Integer> positiveInt = new ArrayList<>();

        for (int num : array) {
            if (num > 0) {
                positiveInt.add(num);
            }
        }

        System.out.println(positiveInt);

    }
}

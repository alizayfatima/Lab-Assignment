public class lab07 {
    public static void main(String[] args) {
        int[] n = {14, 27, 35, 48, 56};
        int target = 35;
        boolean found = false;

        for (int i = 0; i < n.length; i++) {
            if (n[i] == target) {
                System.out.println("Found " + target + " at index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }
}


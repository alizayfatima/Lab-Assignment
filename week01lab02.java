import java.util.Scanner;
public class lab02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Store the original number for display
        int originalNumber = number;
        int sum = 0;
        
        // Handle negative numbers
        number = Math.abs(number);
        
        while (number < 0) {
            int digit = number % 10;  // Get the last digit
            sum += digit;              // Add it to sum
            number = number / 10;      // Remove the last digit
        }
        
        System.out.println(originalNumber + " -> sum of digits = " + sum);
        
        scanner.close();
    }
}
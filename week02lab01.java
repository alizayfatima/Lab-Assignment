 import java.util.Scanner;

public class lab01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    //1

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        String reverse = "";

        // append method
        for(int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);


       //2

        System.out.print("Enter a string: ");
        String str2 = input.nextLine();

        String reverse2 = "";

        // prepend method
        for(int i = 0; i < str.length(); i++) {
            reverse = str.charAt(i) + reverse;
        }

        System.out.println("Reversed String: " + reverse);
    }
}     
       //hence both give same output
    
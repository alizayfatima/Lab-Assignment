import java.util.Scanner;
public class lab03 {
 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        int num;

        while(true) {
            System.out.print("Enter a number (0 to stop): ");
            num = input.nextInt();

            if(num == 0) {
                break; 
            }

            sum += num;
        }

        System.out.println("Total Sum = " + sum);
        
    }
}


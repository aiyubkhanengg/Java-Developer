import java.util.Scanner;
// find the greatest of 3 inputted numbers in java
/**
 *
 * @author AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
 */

public class GreatestOfthreeInputnumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st number : ");
        int num1 = scanner.nextInt();

        System.out.println("Enter 2nd number : ");
        int num2 = scanner.nextInt();

        System.out.println("Enter 3rd number : ");
        int num3 = scanner.nextInt();

        if(num1 >= num2) {

            if(num1 >= num3) {
                System.out.println(num1 + " Is Largest number");
            } else {
                System.out.println(num3 + " Is Largest number");
            }
            
        } else {

            if(num2 >= num3) {
                System.out.println(num2 + " Is Largest number");
            } else {
                System.out.println(num3 + " Is Largest number");
            }

        }

    }
}
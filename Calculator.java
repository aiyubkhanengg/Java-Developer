import java.util.Scanner;
//This Program Created By AIYUB KHAN Git (aiyubkhanengg/Java-Developer)
//Simple Java Calculator Program Using Scanner And Switch Case....
public class Calculator {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter first numbers: ");

        // nextDouble() reads the next double from the keyboard
        double first = reader.nextDouble();
        System.out.print("Enter second numbers: ");
        double second = reader.nextDouble();

        System.out.print("Choose operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}

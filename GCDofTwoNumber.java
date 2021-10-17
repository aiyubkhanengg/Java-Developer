//Write a program to find the GCD of two numbers in java
// This program Coded By AIYUB KHAN GIT(aiyubkhanengg/Java-Developer)
public class GCDofTwoNumber {

    public static void main(String[] args) {

    	//Lets take two numbers 30 and 50 and find their GCD
        int num1 = 30, num2 = 50, gcd = 1;

        for(int i = 1; i <= num1 && i <= num2; i++)
        {
            if(num1%i==0 && num2%i==0)
                gcd = i;
        }

        System.out.printf("GCD of %d and %d is: %d", num1, num2, gcd);
    }
}
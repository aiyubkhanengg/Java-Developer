/* Java Program to Check Palindrome or Not */
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
      
import java.util.Scanner;

public class PalindromeOrNot
{
    public static void main(String args[])
    {
        int num, rem, orig, rev=0;
        Scanner scan = new Scanner(System.in);
      
        System.out.print("Enter A Any Number : ");
        num = scan.nextInt();
      
        orig = num;
      
        while(num != 0)
        {
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }
        
        // check if the original number is equal to its reverse
        
        if(rev==orig)
        {
            System.out.print("This is a Palindrome Number");
        }
        else
        {
            System.out.print("This is not a Palindrome Number");
        }
    }
}
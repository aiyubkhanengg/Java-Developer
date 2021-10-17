//Java Program to find the Factorial of a Number Using While Loop..
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
import java.util.Scanner;
class FactorialUsingForLoop
{
	public static void main(String arg[])
	
	{
	
            long n,fact=1;
	
	    Scanner sc=new Scanner(System.in);
 
	    System.out.println("Enter The number");
	   
            n=sc.nextLong();
 
	    for(int i=1;i<=n;i++)
	    {
	
	    fact=fact*i;
 
 	    }
 
  	    System.out.println("Factorial Number Is "+fact);
 
	}
}
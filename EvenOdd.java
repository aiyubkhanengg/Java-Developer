import java.util.Scanner;
//This program to check if the given number is odd or even..
//This Program Coded By AIYUB KHAN. Git(aiyubkhanengg/Java-Developer)
class EvenOdd
{
public static void main(String args[])
{
int num;
Scanner sc=new Scanner(System.in);
System.out.println("Enter The Number..");
num=sc.nextInt();
if(num%2==0)
{
System.out.println("Is Even Number");
}
else
{
System.out.println("Is Odd Number");
} 
} 
}
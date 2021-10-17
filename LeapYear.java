import java.util.Scanner;
//This program to check if the given year is a Leap Year or not in java
//This Program Coded By AIYUB KHAN GIT(aiyubkhanengg/Java-Developer)
public class LeapYear 
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int y = s.nextInt();
        boolean b = false;
        if(y % 400 == 0)
        {
            b = true;
        }
        else if (y % 100 == 0)
        {
            b = false;
        }
        else if(y % 4 == 0)
        {
            b = true;
        }
        else
        {
            b = false;
        }
        if(b == true)
        {
            System.out.println("The year "+ y +" is a leap year");
        }
        else
        {
            System.out.println("The year "+ y +" is not a leap year");
        }
    }
}
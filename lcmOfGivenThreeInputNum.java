// Write a program to find the LCM of 3 numbers and throw exception if any of the given numbers is negative in Java
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor MOHD AIYUB KHAN
import java.util.Scanner;
public class lcmOfGivenThreeInputNum {
   public static void main(String args[]){
      int a, b, c, max, step, lcm = 0;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter First number ::");
      a = sc.nextInt();
      System.out.println("Enter Second number ::");
      b = sc.nextInt();
      System.out.println("Enter Third number ::");
      c = sc.nextInt();
      
      if(a > b){
         max = step = a;
      }
      else if(b > c){
         max = step = b;
         
      }
      
      else{
         max = step = c;
         // Throw New Negative Number Exception:
         throw new IllegalArgumentException("Wrong Input : Sorry ): Negative Or Same Number Not Allowed");
      }

      while(a!= 0) {
         if(max % a == 0 && max % b == 0 && max % c == 0) {
            lcm = max;
            break;
         }
         max += step;
      }
      System.out.println("LCM Of Given Numbers Is :: "+lcm);
     
   }
}
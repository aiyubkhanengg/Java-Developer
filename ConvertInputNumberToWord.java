// Convert User Given Input Number To Word
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)

import java.util.Scanner;
 
public class ConvertInputNumberToWord {
 
   public static void main(String[] args) {
	int number = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please type a number");
	try {
           // read the number
	   number = scanner.nextInt();
	   if (number == 0) {
		System.out.print("Number in words: Zero");
	   } else {
		System.out.print("Number in words: " + numberToWord(number));
	   }
	 } catch (Exception e) {
		System.out.println("Please enter a valid number");
	 }
	// close the reader
	scanner.close();
   }
 
   private static String numberToWord(int number) {
        // variable to hold string representation of number 
        String words = "";
        String unitsArray[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", 
                      "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                      "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                      "Eighteen", "Nineteen" };
	String tensArray[] = { "Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                      "Sixty", "Seventy", "Eighty", "Ninety" };
 
	if (number == 0) {
	    return "Zero";
	}
	// add minus before conversion if the number is less than 0
	if (number < 0) { 
           // convert the number to a string
           String numberStr = "" + number; 
           // remove minus before the number 
           numberStr = numberStr.substring(1); 
           // add minus before the number and convert the rest of number 
           return "minus" + numberToWord(Integer.parseInt(numberStr)); 
        } 
        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
	   words += numberToWord(number / 1000000) + " Million ";
	   number %= 1000000;
	}
	// check if number is divisible by 1 thousand
	if ((number / 1000) > 0) {
	    words += numberToWord(number / 1000) + " Thousand ";
	    number %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((number / 100) > 0) {
	     words += numberToWord(number / 100) + " Hundred ";
	     number %= 100;
	}
 
	if (number > 0) {
	     // check if number is within teens
	     if (number < 20) { 
                    // fetch the appropriate value from unit array
                    words += unitsArray[number];
             } else { 
                // fetch the appropriate value from tens array
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += " " + unitsArray[number % 10];
                }  
	     }
          }
	  return words;
   }
}
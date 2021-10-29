//Write a function to convert a given number to Words (I/P number would be less than 10000).
/*Ex :
I/P : 72 -> Seventy Two

I/P : 1000 -> One Thousand
*/
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@author: AIYUB KHAN

 public class ConvertNumberToWord  
 
{
    private static final String[] specialNames = {
        "",
        " Thousand",
        " Million",
        " Billion"
    };
    
    private static final String[] tensNames = {
        "",
        " Ten",
        " Twenty",
        " Thirty",
        " Forty",
        " Fifty",
        " Sixty",
        " Seventy",
        " Eighty",
        " Ninety"
    };
    
    private static final String[] numNames = {
        "",
        " One",
        " Two",
        " Three",
        " Four",
        " Five",
        " Six",
        " Seven",
        " Eight",
        " Nine",
        " Ten",
        " Eleven",
        " Twelve",
        " Thirteen",
        " Fourteen",
        " Fifteen",
        " Sixteen",
        " Seventeen",
        " Eighteen",
        " Nineteen"
    };
    
    private String convertNumber(int number) {
        String current;
        
        if (number % 100 < 20){
            current = numNames[number % 100];
            number /= 100;
        }
        else {
            current = numNames[number % 10];
            number /= 10;
            
            current = tensNames[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return numNames[number] + " Hundred" + current;
    }
    
    public String convert(int number) {

        if (number == 0) { return "Zero"; }
        
        String prefix = "";
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertNumber(n);
                current = s + specialNames[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        return (prefix + current).trim();
    }
    
    public static void main(String[] args) {
        ConvertNumberToWord nctw = new ConvertNumberToWord();
        System.out.println(72 + ":" + nctw.convert(72));
        System.out.println(1000 + ":" + nctw.convert(1000));
	System.out.println(9999 + ":" + nctw.convert(9999));
	System.out.println(10000 + ":" + nctw.convert(10000));
    }
}
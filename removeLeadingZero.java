//Java Program to Remove leading zeros
//This program coded by AIYUB KHAN GIT(aiyubkhanengg/Java-Developer)
//@author  MOHD AIYUB KHAN

import java.util.Arrays; 
import java.util.List; 

class removeLeadingZero 
{ 
    public static String removeLeadingZero(String str) 
    { 
        // Count leading zeros 
        int i = 0; 
        while (str.charAt(i) == '0') 
            i++; 
  
        // Convert str into StringBuffer as Strings 
        // are immutable. 
        StringBuffer sb = new StringBuffer(str); 
  
        // The  StringBuffer replace function removes 
        // i characters from given index (0 here) 
        sb.replace(0, i, ""); 
  
        return sb.toString();  // return in String 
    } 
  

    public static void main (String[] args) 
    { 
        String str = "0000012356"; 
        str = removeLeadingZero(str); 
        System.out.println(str); 
    } 
} 
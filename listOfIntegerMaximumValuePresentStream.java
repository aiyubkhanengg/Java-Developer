//Given a list of integers, find the maximum value element present in it using Stream functions?
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
public class listOfIntegerMaximumValuePresentStream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,18,8,49,25,100,99,32,15);
            int max =  myList.stream()
                             .max(Integer::compare)
                             .get();
            System.out.println(max);                    
    }
}

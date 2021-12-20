//Given a list of integers, find out all the numbers starting with 1 using Stream functions?
//This program coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
public class numberStartingOneUsingStream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,12,15,8,49,25,98,32);
            myList.stream()
                  .map(s -> s + "") // Convert integer to String
                  .filter(s -> s.startsWith("1"))
                  .forEach(System.out::println);
    }
}

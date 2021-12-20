//Given the list of integers, find the first element of the list using Stream functions?
//This program coded By AIYUB KHAN GIT (aiyubkhanengg/Java-developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
public class firstElementOfListUsingStream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(20,30,8,49,25,88,88,23,25);
            myList.stream()
                  .findFirst()
                  .ifPresent(System.out::println);
    }
}
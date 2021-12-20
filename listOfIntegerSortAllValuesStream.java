//Given a list of integers, sort all the values present in it using Stream functions?
//This program coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class listOfIntegerSortAllValuesStream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,98,8,12,49,98,80,32,15);

             myList.stream()
                   .sorted()
                   .forEach(System.out::println);
    }
}

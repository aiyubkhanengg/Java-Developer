//Given a list of integers, sort all the values present in it in descending order using Stream functions?
//This program coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
import java.util.function.Function;

public class listOfIntegerSortAllValuesdescendingUsing Stream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(20,10,6,49,25,70,90,40,12);

             myList.stream()
                   .sorted(Collections.reverseOrder())
                   .forEach(System.out::println);
    }
}
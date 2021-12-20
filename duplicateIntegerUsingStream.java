//How to find duplicate elements in a given integers list in java using Stream functions?
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uther MOHD AIYUB KHAN

import java.util.*;
import java.util.stream.*;
public class duplicateIntegerUsingStream {
    public static void main(String args[]) {
            List<Integer> myList = Arrays.asList(10,12,15,10,49,25,88,88,32,15);
            Set<Integer> set = new HashSet();
            myList.stream()
                  .filter(n -> !set.add(n))
                  .forEach(System.out::println);
    }
}
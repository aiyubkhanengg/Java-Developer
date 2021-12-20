//Find even numbers from Using Stream Function
//This program Coded By AIYUB KHAN GIT(aiyubkhanengg/Java-Developer) 
//@uther MOHD AIYUB KHAN

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class evenNumberUsingStreamFunction 
{
    public static void main(String[] args) 
    {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
         
        Predicate<Integer> condition = new Predicate<Integer>() 
        {
            @Override
            public boolean test(Integer n) {
                if (n % 2 == 0) {
                    return true;
                }
                return false;
            }
        };
 
        list.stream().filter(condition).forEach(System.out::println);
    }
}
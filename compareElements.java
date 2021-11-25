// Java Program to Compare Elements in a Collection
//This Program Coded By AIYUB KHAN GIT (aiyubkhanengg-Java-Developer)
//@uthor MOHD AIYUB KHAN
import java.io.*;
import java.util.*;

class compareElements {
	public static void main(String[] args)
	{
		// List initialization
		List<Integer> val = new ArrayList<>();

		// Add elements in the list
		val.add(10);
		val.add(4);
		val.add(15);
		val.add(7);
		val.add(9);
		//Given List
		System.out.println("Given Value List Is:\n"+val);

		// Minimum in the list
		int minimum = Collections.min(val);

		// Maximum in the list
		int maximum = Collections.max(val);

		if (minimum == maximum) {
			System.out.println("All elements are equal");
		}
		else {
			System.out.println("Min value of our list : "
							 + minimum);
			System.out.println("Max value of our list : "
							+ maximum);
		}
	}
}

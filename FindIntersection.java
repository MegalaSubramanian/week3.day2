package week3.day2.assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		 * 
		 * a) Declare An array for {3,2,11,4,6,7}; b) Declare another array for
		 * {1,2,8,4,9,7}; c) Declare for loop iterator from 0 to array length d) Declare
		 * a nested for another array from 0 to array length e) Compare Both the arrays
		 * using a condition statement
		 * 
		 * f) Print the first array (shoud match item in both arrays)
		 */

		int Array1[] = { 3, 2, 11, 4, 6, 7 };
		int Array2[] = { 1, 2, 8, 4, 9, 7 };
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		System.out.print("List1: ");
		for (int i = 0; i < Array1.length; i++) {
			list1.add(Array1[i]);
			System.out.print(list1.get(i) + " ");
		}
		System.out.print("List2: ");
		for (int i = 0; i < Array2.length; i++) {
			list2.add(Array2[i]);
			System.out.print(list2.get(i) + " ");
		}
		System.out.println("");
		System.out.print("The intersection values are : ");
		for (int j = 0; j < list2.size(); j++) {
			if (list1.contains(list2.get(j))) {
				System.out.print(list2.get(j)+"  ");

			}
		}
	}

}

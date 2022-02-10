package week3.day2.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrintDuplicatesInarray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> number = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			number.add(arr[i]);
		}
		Collections.sort(number);
		System.out.println("The list of numbers in the array are: "+number);
		System.out.println("The Duplicate numbers in the array are");
		for(int i=0;i<(number.size()-1);i++)
		{
		if((number.get(i)).equals(number.get(i+1))) {
			System.out.println(number.get(i));
		}
		}		
	}

}

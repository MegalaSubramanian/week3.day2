package week3.day2.assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8};
		List<Integer> number = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			number.add(arr[i]);
		}
		Collections.sort(number);
			for(int i=0;i<number.size();i++) {
				if((number.get(i)).equals(i+1)){
				}else {
					System.out.println("The missing element in the array is: "+(i+1));
					break;
				}
			}
			
	
		}
	
	}

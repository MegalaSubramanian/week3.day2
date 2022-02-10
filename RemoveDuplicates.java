package week3.day2.assessment;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		String[] words = text.split(" ");
		Set<String> wordSet = new LinkedHashSet<String>();		
		
		for(int i=0;i<words.length;i++) {			
			wordSet.add(words[i]);			
		}
		System.out.println(wordSet);
		
	}
}



	
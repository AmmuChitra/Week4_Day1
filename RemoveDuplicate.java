package week4_Day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) {
		
		String text = "We learn java basics";
		
		String[] split = text.split(" ");
		
		Set<String> removedup = new LinkedHashSet<String>();
		
		for (int i = 0; i < split.length; i++) {
			
			removedup.add(split[i]);
			
			}
		System.out.println(removedup);

	}

}
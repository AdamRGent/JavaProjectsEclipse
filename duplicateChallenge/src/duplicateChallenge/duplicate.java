package duplicateChallenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class duplicate {
	
	public static void main(String[] args) {
		
		List<String> input1 = new ArrayList<>();
		Map<String,Integer> hm = new HashMap();
		
		input1.add("A");
		input1.add("a");
		input1.add("s");
		input1.add("d");
		input1.add("e");
		input1.add("f");
		input1.add("s");
		input1.add("g");
		input1.add("h");
		input1.add("!");
		input1.add("!");
		input1.add("!");
		for(String s: input1){
		System.out.println(s + " " + Collections.frequency(input1, s));
			}
		int size = input1.size();
		

		
		Set<String> hashSet = new HashSet<>();
    
		hashSet.add("A");
		hashSet.add("a");
		hashSet.add("s");
		hashSet.add("d");
		hashSet.add("e");
		hashSet.add("f");
		hashSet.add("s");
		hashSet.add("g");
		hashSet.add("h");
		hashSet.add("!");
		hashSet.add("!");
		hashSet.add("!");
		int size1 = hashSet.size();
		
		int duplicate = size - size1;
		System.out.println("The number of duplicate values is: " + duplicate);
		}

}


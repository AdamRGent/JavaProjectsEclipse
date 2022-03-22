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

		Map<String,Integer> repeatationMap= new HashMap<String,Integer>();
	    for(String str : input1){

	        if(repeatationMap.containsKey(str)) {
	            repeatationMap.put(str,repeatationMap.get(str) + 1);
	        }
	        else {
	            repeatationMap.put(str, 1);
	        }
	    }

	    int count = 0;
	    for(int repatCount : repeatationMap.values()){
	        if(repatCount > 1) {
	            count++;
	        }
	    }
	    System.out.println("Number of Strings repeated : " + count);
}
}


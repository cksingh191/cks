package Cks_Test;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		
		findDuplicateword("This is java java is strong programming language");
		findDuplicateword("a a a b b c c d");

	}
	public static void findDuplicateword(String Inputword) {
		
		String words[]=Inputword.split(" ");
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		for(String word:words) {
			Integer count=map.get(word);
			if(count==null) {
				map.put(word, 1);
			} else {
				map.put(word, ++count);
			}
		}
		for(Map.Entry<String, Integer> m:map.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+" "+m.getValue()+" Times");
			}
		}
		
	}

}

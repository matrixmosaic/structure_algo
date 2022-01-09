package structure_algo.array_string;

import java.util.HashSet;
import java.util.Set;

public class Soultion {
	
	/*
	 * 1.1Is Unique: Implement an algorithm to determine if a string has all unique
	 * characters. What if you cannot use additional data structures? Hints:
	 * #44^117^132
	 */
	
	
	public static boolean hasUniqueElements(String str) {
	
		
		char[] charArray = new char[str.length()];
		
		int counter = 0;
		for(char character : str.toCharArray() ) {
			
			System.out.println("CHARACTER:"+character);

			
			
			for(char uniqCharacter : charArray ) {
		

				
				if( uniqCharacter == character) {
					
					return false;
					
					
				}
			
			}
			
			charArray[counter]=character;
			counter++;
			
			
		}
		
		System.out.println("CHECKED CHARACTERS:"+charArray.toString());

		return true;
	}
	
	

	public static boolean isUniqueChars(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] char_set = new boolean[128];
		for (int i = 0; i < str.length(); i++) {
			
			System.out.println("str.charAt(i):"+str.charAt(i));
			int val = str.charAt(i);
			System.out.println("val:"+val);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
	
	public static boolean isUniqueCharsBySet(String str) {
		if (str.length() > 128) {
			return false;
		}
		Set<Character> char_set = new HashSet<Character>();
		for (Character character: str.toCharArray()) {
			
			
			
			if(!char_set.add(character)) {
				return false;
				
			}
		}
		char_set=null;
		return true;
	}
	
	
	public static boolean isUnique(String str) {
		if (str.length() > 128) {
			return false;
		}
		
		
		boolean char_set[] = new boolean[128];
		int val;
		
		for(int i=0; i<str.length(); i++)			
		{
			val = str.charAt(i);
			
			if(char_set[val]) {
				
				return false;
			}
			char_set[val]=true;
		}
	
	
		return true;
	}
	
}

package practiceprograms.com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountUsingHashMap {

	public static boolean isSpecial(char first, char last) {
		List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
		if(vowels.contains(first)&&vowels.contains(last)) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		
		String name = "AzzzKA";
		name=name.toLowerCase();
		System.out.println(isSpecial(name.charAt(0),name.charAt(name.length()-1))? "Name is Special":"Name isn't Special");
		
	}


}

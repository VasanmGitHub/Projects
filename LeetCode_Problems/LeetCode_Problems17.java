package LeetCode_Problems;
import java.util.*;
// Phone Number Combination
public class LeetCode_Problems17 {
	 Map<Character, List<Character>> keyboard = Map.of(
		        '2', List.of('a', 'b', 'c'),
		        '3', List.of('d','e','f'),
		        '4', List.of('g','h','i'),
		        '5', List.of('j','k','l'),
		        '6', List.of('m','n','o'),
		        '7', List.of('p','q','r', 's'),
		        '8', List.of('t','u','v'),
		        '9', List.of('w','x','y', 'z')
		    );
	 
	public static List<String> letterCombinations(String digits) {
		ArrayList<String> result = new ArrayList<>();
		Map<Character , String> map = new HashMap();
		if(digits.length() <= 0) return result;
		map.put('2', "abc");
		map.put('3', "def");
		map.put('4', "ghi");
		map.put('5', "jkl");
		map.put('6', "mno");
		map.put('7', "pqrs");
		map.put('8', "tuv");
		map.put('9', "wxyz"); 
		
		for(int i = 0 ; i < map.get(digits.charAt(0)).length();i++) 
			result.add(map.get(digits.charAt(0)).charAt(i)+"");
		
		
		for(int i = 1 ; i < digits.length();i++) {
			ArrayList<String> temp = new ArrayList<>();
			char c = digits.charAt(i);
			for(String s:result) {
				for(int j = 0 ; j < map.get(c).length();j++) {
					
					temp.add(s+map.get(c).charAt(j));
				}
			}
			
			result = temp;
			
		}
		
        return result;
    }
	public static void main(String[] args) {
		
		System.out.println(letterCombinations(""));
	}

}

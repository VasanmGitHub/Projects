package LeetCode_Problems;
import java.util.*;
// 20. isValid -->validParentheses
public class LeetCode_Problems20 {
  public static boolean validParentheses(String s) {
	  ArrayList<Character> list = new ArrayList<>();
	  
	  for(int i = 0; i < s.length();i++) {
		  char c = s.charAt(i) ;
		  if(c == ')') {
			  if(list.isEmpty() || list.get(list.size()-1) != '(') return false;
			  else
				  list.remove(list.size()-1);
		  }
		  else if(c == '}') {
			  if(list.isEmpty() || list.get(list.size()-1) != '{') return false;
			  else
				  list.remove(list.size()-1);
		  }
		  else if(c == ']') {
			  if(list.isEmpty() ||list.get(list.size()-1) != '[') return false;
			  else
				  list.remove(list.size()-1);
		  }
		  else
			  list.add(c);
			  
	  }
	  
	 return list.isEmpty() ? true : false;
 }
	public static void main(String[] args) {
		 
		System.out.println(validParentheses(""));

	}

}

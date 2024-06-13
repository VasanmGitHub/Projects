package LeetCode_Problems;
import java.util.*;
public class LeetCode_Problems3 {
	 public static int lengthOfLongestSubstring(String s) {
	       int result = 0 , count = 0 , temp = 0;
		  ArrayList<Character> list = new ArrayList();
		  for(int i = 0; i < s.length(); i++) {
			 
			if(!list.contains(s.charAt(i))) {
				  list.add(s.charAt(i));
				  if(count == 0)temp = i ;
				  count++;
				  
				  
				  
			  }
			  else {
				 result = result > count ? result : count ;
				 count = 0 ;
				 list.removeAll(list);
				  
				i = temp;
			  }
		  }
	       
		 return  result > count ? result : count ;
	    }
	public static void main(String[] args) {
		int i = 0;
		i++;
		
		
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}

}

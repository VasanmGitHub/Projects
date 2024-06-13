package LeetCode_Problems;
import java.util.*;           ///// 22 . generateParenthesis --- >>>
public class LeetCode_Problems22 {
	 public static List<String> generateParenthesis(int n) {
	                List<String> res = new ArrayList<String>();
	                recurse(res, 0, 0, "", n);
	                System.out.println(res.size());
	                return res;
	                
	    }
	  public static void recurse(List<String> res, int open, int close, String s, int n) {
		  if(s.length() == n*2) {
			   res.add(s);
			  
			  return;
		  }
		  
		  if(n > open ) {
			  recurse(res , open+1 , close , s + '(' , n);
			   
			  
		  }
		  if(open > close) {
			  recurse( res,  open,  close+1,  s + ')',  n);
			 
		  }
		  
		  
			  
	  }

	public static void main(String[] args) {
		
	 	System.out.println(generateParenthesis(3));
		 ;
	}

}

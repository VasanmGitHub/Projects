package LeetCode_Problems;

public class LeetCode_Problems5 {
	 public static String longestPalindrome(String s) {
	     if(s.length() <= 1) return s;   
		 String result = "";
	        for(int i = 1 ; i < s.length();i++) {
	        	int  j = i-1 , k = i + 1 ;
	        	 
	        	while(j >= 0 && k < s.length()  && s.charAt(j) == s.charAt(k)) {
	        		
	        		 result = s.substring(j, k+1).length() > result.length() ? s.substring(j, k+1) : result; 
	        		 j--; k++;
	        	}
	        	
	        	j = i-1 ; k = i  ;
	        
	        	while(j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
	        		 
	        		 result = s.substring(j, k+1).length() > result.length() ? s.substring(j, k+1) : result; 
	        		 j--; k++;
	        		  
	        	}
	        	 
	        }
	        
	        if(result.length() <= 0) return result+s.charAt(0);
	        
	        return result;
	    }
	public static void main(String[] args) {
		
		System.out.println(longestPalindrome("bb"));
		
	}

}

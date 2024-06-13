package LeetCode_Problems;

public class LeetCode_Problems14 {
    public static String longestCommonPrefix(String[] strs) {
        String temp = "" , ans = "";
       for(String s : strs){
    	   if(s.length() <= 0) return s;
            if(temp.length() <= 0){ temp = s ;   continue; }
           
           int i = 0 ;
           while(i < temp.length() && i < s.length()){
        	   
            if(temp.charAt(i) == s.charAt(i)) ans += temp.charAt(i);
            else if(ans.length() <= 0) return ans;
            else               
                break;
            
            i++;
           }
           temp = ans;
           ans = "";
       }
       return temp;
    }
	public static void main(String[] args) {
		String [] s = {"nflower","","flight"};
		System.out.println(s[0].indexOf(s[1]));
		//System.out.println(longestCommonPrefix(s));
	}

}

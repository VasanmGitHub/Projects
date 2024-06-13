package LeetCode_Problems;

public class LeetCode_Problems9 {
	  public static boolean isPalindrome(int x) {
	        if(x < 0) return false;
	        long num = 0 ; int temp = x ;
	        while(x != 0) {
	        num = (num*10) + (x % 10);
	        x = x / 10 ;
	        }
	        
	        return temp == num;
	    }
	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

}

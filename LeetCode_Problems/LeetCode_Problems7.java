package LeetCode_Problems;

public class LeetCode_Problems7 {
	public static int reverse(int x) {
		long num = 0 ;
		while(x != 0) {
			int n = x % 10;
			num = num * 10 + n ;
			x = x / 10 ;
			 
		}
		if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) return 0;
		
		return (int) num;
		
		
	}
	
	public static void main(String[] args) {
		 
		System.out.println(reverse(-1234));
	}

}

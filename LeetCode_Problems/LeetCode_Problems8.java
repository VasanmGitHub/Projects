package LeetCode_Problems;

public class LeetCode_Problems8 {
	public static int myAtoi(String s) {
		long ans = 0 ; int count = 0 , temp = 0 ; boolean minus = false;
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(temp == 0 ) {
				if( c >= 'a' && c <= 'z' || c == '.') return 0;
				
			if( c == '-' || c == '+') {
				if(count == 0)
					minus = (c == '-' ) ? true : false ;
				count++;
				if(count > 1) break;
				temp++;
				continue;
			}
			
		}
			
			System.out.println(ans);
			if(c >= '0' && c <= '9' ) { temp++; 
				
				
				
					ans = ans*10 + (c - '0');
					
				 
				if(ans > Integer.MAX_VALUE && minus) return Integer.MIN_VALUE;
				if(ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
				
			}
			 
			else if( temp > 0 || count > 1)
						break;
					
//			
		}
		return (int) (minus ? -ans : ans); 
	}
	public static void main(String[] args) {
		// System.out.println(' ' +1);
		System.out.println(myAtoi(" -923+4"));
	}

}

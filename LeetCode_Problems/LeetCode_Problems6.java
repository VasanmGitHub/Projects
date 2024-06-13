package LeetCode_Problems;
//LeetCode problem No6
public class LeetCode_Problems6 {

public static String ZigzagConvertions(String s , int n) {
	String ans = "";
	if(n <= 1 || s.length() <= n) return s;
	
	int SpaceCount = n * 2 - 2 , temp = SpaceCount;
	int i = 0 ;
	while(i < n) {
		int currChar = i ;
		SpaceCount = temp;
		while(currChar < s.length()) {
			ans = ans + s.charAt(currChar);
			
			currChar += SpaceCount;
			
			if(SpaceCount < n * 2 - 2 ) {
				SpaceCount =  n * 2 - 2 - SpaceCount ;
			}
		}
		temp -= 2;
		if(temp < 2) temp = n * 2 - 2;
		
		i++;
		
	}
	 
	return ans;
}
	public static void main(String[] args) {
		 System.out.println(ZigzagConvertions("awasdfghjexrctvbh" , 5));
		 
	}

}

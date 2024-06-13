package LeetCode_Problems;

public class LeetCode_Problems12 {
	 public static String intToRoman(int num) {
	        String ans = "";
	        char[] value = { 1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 1 };
	        String[] symble = { "M" , "CM" , "D" , "CD" ,"C" , "XC" ,"L" , "XL" , "X" , "IX" , "V","IV","I"};
	        
	        while(num > 0) {
	        	int index = 0 ;
	        	while(index < value.length) {
	        		 
	        		if(num >= value[index]) {
	        			ans = ans + symble[index];
	        			num = num - value[index];
	        			index--;
	        		}
	        		index++;
	        	}
	        }
	        return ans; 
	    }
	public static void main(String[] args) {
		
		System.out.println(intToRoman(20));
	}

}

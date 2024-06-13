package LeetCode_Problems;

public class LeetCode_Problems11 {
	 public static int maxArea(int[] height) {
	        int max = 0 ;
	        for(int i = 0 ; i < height.length ; i++) {
	        	int end = height.length -1;
	        	while(i < end) {
	        		int min = Math.min(height[i], height[end]);
	        		int temp = min * (end - i );
	        		max = Math.max(max, temp);
	        		
	        		end--;
	        	}
	        	int temp = height[i];
	        	while(i < height.length-1 && temp >= height[i+1]) i++;
	        }
	        return max;
	    }
	public static void main(String[] args) {
		 int[] n = {1,8,6,2,5,4,8,3,7};
		 System.out.println(maxArea(n));

	}

}

package LeetCode_Problems;

import java.util.*;

// 3Sum Closet
public class LeetCode_Problems16 {
	   public static int threeSumClosest(int[] nums, int target) {
	        int lastdiff = Integer.MAX_VALUE  , ans = 0 ;
	        Arrays.sort(nums);
	         for(int i = 0 ; i < nums.length-2 ; i++) {
	        	 int left = i + 1 , right = nums.length-1;
	        	 while(left < right) {
	        		 int sum = nums[i] + nums[left] + nums[right];
	        		 
	        		 if(sum == target) return target;
	        		 
	        		 else if(sum < target) {
	        			 int diff = target - sum;
	        			 if(diff < lastdiff) {
	        				 ans = sum;
	        				 lastdiff = diff;
	        			 }
	        			  
	        			 left++ ;
	        			
	        		 }
	        		 else {
	        			int diff = sum - target;
	        			if(diff < lastdiff) {
	        				 ans = sum;
	        				 lastdiff = diff;
	        			 }
	        			right--;
	        		 }
	        	 }
	         }
	        return  ans;
	    }
	public static void main(String[] args) {
		 int n[] = {-1,2,1,-4};
		 System.out.println(threeSumClosest(n , 1));

	}

}

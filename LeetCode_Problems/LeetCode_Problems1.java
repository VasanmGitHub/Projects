package LeetCode_Problems;

// LeetCode problem No1
public class LeetCode_Problems1 {
	 public static int[] twoSum(int[] nums, int target) {
	       int ans[] = new int[2];
	       for(int i = 0 ;i < nums.length -1 ;i++ ) {
	    	  for(int j = i+1; j < nums.length;j++) {
	    		  if(nums[i]+nums[j] == target) {
	    			  ans[0] = i;
	    			  ans[1] = j;
	    		  }
	    	  }
	       }
	       return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

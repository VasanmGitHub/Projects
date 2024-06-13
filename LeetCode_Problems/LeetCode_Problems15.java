package LeetCode_Problems;
import java.util.*;
public class LeetCode_Problems15 {
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> result = new HashSet<>();
		
		for(int i = 0; nums[i] <= 0 && i < nums.length -2; i++) {
			int   left = i + 1 , right = nums.length-1;
			
			while(left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if(sum == 0) {
					result.add(Arrays.asList(nums[i] , nums[left] , nums[right]));
					left++;
					right--; 
				}
				else if(sum < 0)
					left++;
				else
					right--;
			}
			
			
		}
 		 
		return new  ArrayList<List<Integer>>(result);
        
    }
	public static void main(String[] args) {
		int n [] = {-1,0,1,2,-1,-4};  
		System.out.println(threeSum(n) );
		 
	}

}

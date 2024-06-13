package LeetCode_Problems;

import java.util.*;
///// 4Sum
public class LeetCode_Problems18 {
	public static List<List<Integer>> fourSum(int[] nums , int target) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		int sum = 0 ;
		for(int i = 0 ; i < nums.length-3;i++) {
			  if(nums[i] > target && nums[i] > 0) continue;
			 
			for(int j = i+1; j < nums.length-2;j++) {
				int left = j + 1 , right = nums.length-1;
				while(left < right) {
					sum = nums[i] + nums[j] + nums[left] + nums[right];
					if(sum == target) {
						set.add(Arrays.asList(nums[i] , nums[j] , nums[left] , nums[right]));
						right--; left++;
						System.out.println(sum);
					}
					else if(sum > target)
						right--;
					else
						left++;
				}
			}
		}
		for(List<Integer> l : set) {
			System.out.println(l);
		}
		  
		 return new ArrayList<List<Integer>>(set);
	}
	
	public static void main(String[] args) {
		int n[] = {1000000000,1000000000,1000000000,1000000000};
		System.out.println(fourSum(n , -294967296));
		//int sun = 1000000000+ 1000000000+1000000000;
		 
	}

}

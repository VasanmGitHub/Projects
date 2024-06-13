package LeetCode_Problems;

import java.util.*;

public class LeetCode_Problems4 {
	  public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        double result = 0 ;
	        int arr[] = new int[nums1.length + nums2.length];
	        int index = 0 ;
	      
	    	   
	       
	    
	      if(arr.length % 2 == 0) 
	    	  result = (arr[arr.length/2-1] + arr[arr.length/2])/2;
	    	  
	      
	      else 
	    	  result = arr[arr.length/2];
	      
	        
	        return result;
	    }
	public static void main(String[] args) {
		 double b = 1/2;
 		 System.out.println(b);

	}

}

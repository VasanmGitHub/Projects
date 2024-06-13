package LeetCode_Problems;
import java.util.*;
public class LeetCode_Problems23 {
	public static class ListNode{
		      int val;
		      ListNode next;
		     ListNode() {}
		     ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
    public static ListNode mergeKLists(ListNode[] lists) {
    	
    	       ListNode result = new ListNode(Integer.MIN_VALUE);
    	        ListNode temp = result;
    	        if(lists.length <= 0) return result.next; 
    	        for(ListNode n : lists){
    	            if(n == null) continue;
    	            merge(temp , n);
    	        }
    	        return result.next;
    	    }
    	    public static void merge(ListNode temp , ListNode n){
    	        ListNode k = new ListNode(Integer.MIN_VALUE);
    	        ListNode curr = k;
    	        while(temp != null && n != null){
    	            if(temp.val <= n.val){
    	                curr.next = temp;
    	                temp = temp.next;
    	                curr = curr.next;
    	            }
    	            else{
    	                curr.next = n;
    	                n = n.next;
    	                curr = curr.next;
    	            }
    	        }
    	        curr.next = n == null ? temp : n ;
    	        temp = null;
    	        temp = k.next;
    	       
    	    
    }
	public static void main(String[] args) {
		3
	}

}

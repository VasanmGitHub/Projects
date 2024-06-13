package LeetCode_Problems;
// LeetCode Problem No : 2
import java.util.*;
public class LeetCode_Problems2 {
	public class ListNode{
		int val;
		ListNode next;
		ListNode() {}
		ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next;}
	    
	    
	}
 public  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode curr = new ListNode(0);
      ListNode head = curr;
      int carry = 0 ;
      while(l1 != null || l2 != null || carry != 0) {
    	  int digit1 = l1 != null ? l1.val : 0 ;
    	  int digit2 = l2 != null ? l2.val : 0 ;
    	  int sum = digit1 + digit2 + carry;
    	  
    	  int digit = sum % 10 ;
    	  carry = sum / 10 ;
    	  
    	  curr.next = new ListNode(digit);
    	  curr = curr.next;
    	  
    	  l1 = l1 != null ? l1.next : null;
    	  l2 = l2 != null ? l2.next : null;
    	  
      }
      return head.next;
    }
	public static void main(String[] args) {
		
	 
		
		 
	}

}

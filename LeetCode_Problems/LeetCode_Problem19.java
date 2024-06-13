package LeetCode_Problems;

import java.util.List;

public class LeetCode_Problem19 {
	  public static class ListNode {
		      int val;
		      ListNode next;
		      ListNode() {}
		      ListNode(int val) { this.val = val; }
		     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
			 
		  }
	  public static ListNode removeNthFromEnd(ListNode head, int n) {
		  ListNode result = new ListNode(0);
		  ListNode val = result;
		  int count = 0;
		   while(head.next != null) {
			  count++;
			  head = head.next;
		   }
		   System.out.println(count);
	 return null;
        
    }
	public static void main(String[] args) {
		ListNode n = new ListNode(1);
		 
		 
		System.out.println(removeNthFromEnd(n , 2));
	}

}

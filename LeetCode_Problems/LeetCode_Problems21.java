package LeetCode_Problems;
// 21.mergeTwoLists --> LinkedList
public class LeetCode_Problems21 {
	
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
	     ListNode result = new ListNode(0);
	     ListNode temp = result;
	     while(list1 != null && list2 != null){
	        if(list1.val <= list2.val){
	            temp.next = list1;
	            list1 = list1.next;
	        }
	        else{
	            temp.next = list2;
	            list2 = list2.next;
	        }
	        temp = temp.next;
	     }
	        temp.next = list1 == null ? list2 : list1;
	     return result.next;   
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

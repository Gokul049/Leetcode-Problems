package LinkedList;

class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Remove_Duplicates_from_SortedList_83 {
	public static  ListNode deleteDuplicates(ListNode i) {
        ListNode current = i;
        while(current!=null && current.next!=null)
        {
            if(current.val==current.next.val)
            {
                current.next = current.next.next;
                
            }
            else
            {
                current = current.next;
            }
            
        }
        
        return i;
    }
	public static void main(String[] args) {
		 ListNode head = new ListNode(1);
	        head.next = new ListNode(1);
	        head.next.next = new ListNode(1);
	        head.next.next.next = new ListNode(3);
	        head.next.next.next.next = new ListNode(4);

	        // Create solution object
	        Remove_Duplicates_from_SortedList_83 solution = new Remove_Duplicates_from_SortedList_83();
	        ListNode result = solution.deleteDuplicates(head);

	        // Print resulting linked list
	        System.out.print("Linked list after removing duplicates: ");
	        while (result != null) {
	            System.out.print(result.val + " ");
	            result = result.next;
	        }

	}

}

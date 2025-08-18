package LinkedList;

public class Remove_Linked_List_Elements_203 {
	public static ListNode removeElements(ListNode head, int val) {
        ListNode temp = new ListNode(0) , curr = temp;
        temp.next = head;
        while(curr.next != null ){
            if(curr.next.val == val) curr.next = curr.next.next;
            else curr = curr.next;
        }
        return temp.next;
    }
	
	public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        printList(head);

        
        ListNode newHead = removeElements(head, 6);

        System.out.println("List after removing 6:");
        printList(head);
	}

}

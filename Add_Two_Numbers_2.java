package LinkedList;

public class Add_Two_Numbers_2 {
	
	public static  ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode res = dummy;
        int total = 0, carry = 0;
        while(l1!=null || l2!=null || carry!=0)
        {
            total = carry;
            if(l1!=null)
            {
                total += l1.val;
                l1 = l1.next;
            }
            if(l2 !=null)
            {
                total += l2.val;
                l2 = l2.next;
            }
            int num = total % 10;
            carry = total / 10;
            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }
        return res.next;
      
    }
	public static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int d : digits) {
            current.next = new ListNode(d);
            current = current.next;
        }
        return dummy.next;
    }
	
	public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }
	
	public static void main(String[] args) {
		
		int[] arr1 = {2, 4, 3}; // represents 342
        int[] arr2 = {5, 6, 4}; // represents 465
        ListNode l1 = createList(arr1);
        ListNode l2 = createList(arr2);

        ListNode result = addTwoNumbers(l1, l2);
        System.out.print("Output: ");
        printList(result);
	}

}

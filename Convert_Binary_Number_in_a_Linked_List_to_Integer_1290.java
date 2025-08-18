package LinkedList;

public class Convert_Binary_Number_in_a_Linked_List_to_Integer_1290 {
	public static int getDecimalValue(ListNode head) {
        
        int num = 0;

        while(head!=null)
        {
            num = (num<<1) | head.val;
            head = head.next;
        }
        return  num;

    }

	public static void main(String[] args) {
		 ListNode head = new ListNode(1);
	        head.next = new ListNode(0);
	        head.next.next = new ListNode(1);

	        int result = getDecimalValue(head);

	        System.out.println("Decimal Value: " + result); 
		

	}

}

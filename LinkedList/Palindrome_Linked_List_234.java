package LinkedList;
import java.util.*;

public class Palindrome_Linked_List_234 {
	public static boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode tptr = head;
        
        while(tptr!=null)
        {
            
            stack.push(tptr.val);
            tptr = tptr.next;
        }
        ListNode current = head;
        while(current!=null && !stack.isEmpty())
        {
            if(current.val!=stack.pop())
                return false;
            current = current.next;
        }
        return true;
        
    }
	public static void main(String[] args) {
		ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(2);
        head1.next.next.next = new ListNode(1);

        
        System.out.println("Is Palindrome? " + isPalindrome(head1)); // true

        
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);

        System.out.println("Is Palindrome? " + isPalindrome(head2));

	}

}

package Stack;
import java.util.*;
public class Final_Prices_With_a_Special_Discount_in_a_Shop_1475 {
	public static int[] finalPrices(int[] prices) {
	       int n = prices.length;
	        int[] result = new int[n];
	        Stack<Integer> stack = new Stack<>();
	        
	        for (int i = n - 1; i >= 0; i--) {
	            
	            while (!stack.isEmpty() && stack.peek() > prices[i]) {
	                stack.pop();
	            }
	            
	            result[i] = prices[i] - (stack.isEmpty() ? 0 : stack.peek());
	            
	            stack.push(prices[i]);
	        }
	        
	        return result;
	    }
	
	public static void main(String[] args) {
		int arr[] = {8,4,6,2,3};
		System.out.print("[");
		for(int i=0;i<finalPrices(arr).length;i++)
		{
			System.out.print(finalPrices(arr)[i]+" ");
		}
		System.out.print("]");
	}

}

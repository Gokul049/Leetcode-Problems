package Stack;
import java.util.*;
public class Baseball_Game_682 {
	public static  int calPoints(String[] arr) {
        Stack<Integer> stack = new Stack<>();
       for(String s: arr)
       {
            if(s.equals("C"))
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
            else if(s.equals("D"))
            {
                stack.push(2 * stack.peek());
            }
            else if(s.equals("+"))
            {
                int s1 = stack.pop();
                int sum = s1 + stack.peek();
                stack.push(s1);
                stack.push(sum);
            }
            else
            {
                stack.push(Integer.parseInt(s, 10));
            }
       }
       int res = 0;
       while(!stack.isEmpty())
       {
            res += stack.pop();
       }
       return res;
    }
	public static void main(String[] args) {
		String arr1[] = {"5","2","C","D","+"};
		System.out.println("[\"5\",\"2\",\"C\",\"D\",\"+\"] -> "+ calPoints(arr1));
		String arr2[] = {"5","-2","4","C","D","9","+","+"};
		System.out.println("[\"5\",\"-2\",\"4\",\"C\",\"D\",\"9\",\"+\",\"+\"] -> "+calPoints(arr2));
	}

}

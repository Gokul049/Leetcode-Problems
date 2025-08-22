package Stack;
import java.util.*;
public class Basic_Calculator_II_227 {
	
	public static  int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char lastOpt = '+';
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(Character.isDigit(ch))
                num = num*10 + (ch-'0');
            if(!Character.isDigit(ch) && ch!=' ' || i==s.length() - 1)
            {
                if(lastOpt == '+')
                    stack.push(num);
                else if(lastOpt == '-')
                    stack.push(-num);
                else if(lastOpt == '*')
                    stack.push(stack.pop() * num);
                else if(lastOpt == '/')
                    stack.push(stack.pop() / num);
                num = 0;
                lastOpt = ch;
            }
           
        }
        int sum = 0;
        while(!stack.isEmpty())
        {
            sum += stack.pop();
        }
        return sum;
    }
	
	public static void main(String[] args) {
		System.out.println("\"3+2*2\" -> "+calculate("3+2*2"));
		System.out.print("\" 3+5 / 2 \" -> " + calculate(" 3+5 / 2 "));

	}

}

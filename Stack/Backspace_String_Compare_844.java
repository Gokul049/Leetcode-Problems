package Stack;
import java.util.*;
public class Backspace_String_Compare_844 {
	public static boolean backspaceCompare(String s, String t) {
        String str1 = removeBackspace(s);
        String str2 = removeBackspace(t);
        if(str1.equals(str2))
            return true;
        return false;
        
    }
    static String removeBackspace(String n)
    {
         Stack<Character> stack1 = new Stack<>();
        
        for(char c : n.toCharArray())
        {
            if(c=='#')
            {
                if(!stack1.isEmpty())
                    stack1.pop();
            }
            else
            {
                stack1.push(c);
            }
        }
        StringBuilder s1 = new StringBuilder();
        while(!stack1.isEmpty())
        {
            s1.append(stack1.pop());
        }
        return s1.toString();
    }
	public static void main(String[] args) {
		System.out.println(backspaceCompare("ab#c", "ad#c"));

	}

}

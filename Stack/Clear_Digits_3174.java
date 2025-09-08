package Stack;
import java.util.*;
public class Clear_Digits_3174 {
	
	 public static  String clearDigits(String s) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder sb = new StringBuilder("");

	        for(int i=0;i<s.length();i++)
	        {
	            char ch = s.charAt(i);
	            if(ch>='0'&& ch<='9' )
	            {   if(!stack.isEmpty())
	                    stack.pop();
	            }
	            else
	                stack.push(ch);
	        }
	        for(char i: stack)
	        {
	            sb.append(i);
	        } 
	        return sb.toString();
	    }
	
	public static void main(String[] args) {
		System.out.println("abc->"+clearDigits("abc"));   
        System.out.println("cb34->"+clearDigits("cb34"));  
        System.out.println("a1b2c3->"+clearDigits("a1b2c3")); 
        System.out.println("hello123->"+clearDigits("hello123"));

	}

}

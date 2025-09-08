package String;

public class Reverse_String_344 {
	public static void reverseString(char[] s) {
	       int st = 0;
	       int end = s.length-1;
	       while(st<=end)
	       {
	            char temp = s[st];
	            s[st] = s[end];
	            s[end] = temp;
	            st++;
	            end--;
	       }
	      
	    }
	public static void print(char[] s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.print(s[i]+" ");
		}
	}
	public static void main(String[] args) {
		char s[] = {'h','e','l', 'l','o'};
		reverseString(s);
		print(s);
	}

}

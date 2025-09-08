package String;

public class Reverse_Words_in_a_String_III_557 {
	 public static String reverseWords(String s) {
	        String[]  words = s.split(" ");
	        StringBuilder result = new StringBuilder();

	        for(String word : words)
	        {
	            StringBuilder reverse = new StringBuilder(word).reverse();
	            result.append(reverse).append(" ");
	        }
	        result.deleteCharAt(result.length()-1);

	        return result.toString();
	    }
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		System.out.print(reverseWords(s));

	}

}

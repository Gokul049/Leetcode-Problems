package String;

public class Find_the_Difference_389 {
	public static char findTheDifference(String s, String t) {
        int x = 0;
        for(int i=0;i<s.length();i++)
        {
            x ^= (int) s.charAt(i);
        }
        for(int i=0;i<t.length();i++)
        {
            x ^= (int) t.charAt(i);
        }

        return (char) x;
    }
	public static void main(String[] args) {
		var s = "abcd";
		var t = "abcde";
		System.out.println("The difference of s and t is : "+findTheDifference(s, t));
		
	}

}

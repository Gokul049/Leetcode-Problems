package String;

public class Length_of_Last_Word_58 {
	public static  int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(s.charAt(end)==' ')
        {
           end--;
        }
        int st = end;
        while(st>=0 && s.charAt(st)!=' ')
        {
           st--;
        }
        return end - st;

   }
	public static void main(String[] args) {
		System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
	}

}

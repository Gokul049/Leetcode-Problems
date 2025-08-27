package ArrayList;
import java.util.*;
public class Keyboard_Row_500 {
	public static String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        for(String s: words) {
            int flag = isValid("qwertyuiop", s.toLowerCase()) + isValid("asdfghjkl", s.toLowerCase()) + isValid("zxcvbnm", s.toLowerCase());
            if(flag == 1) res.add(s);
        }
        return res.toArray(new String[0]);
    }
    public static int isValid(String a, String b) {
        for(char c: b.toCharArray()) {
            if(a.indexOf(c) == -1) return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
		String arr[] = {"Hello","Alaska","Dad","Peace"};
		for(String s: findWords(arr))
		{
			System.out.print(s + " ");
		}

	}

}

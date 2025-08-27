package String;
import java.util.*;
public class Isomorphic_Strings_205 {
	public static boolean isIsomorphic(String s, String t) {
        Map<Character, Integer> charS = new HashMap<>();
        Map<Character, Integer> charT = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!charS.containsKey(s.charAt(i)))
            {
                charS.put(s.charAt(i), i);
            }
            if(!charT.containsKey(t.charAt(i)))
            {
                charT.put(t.charAt(i), i);
            }
            if(!charS.get(s.charAt(i)).equals(charT.get(t.charAt(i))))
                return false;
        }
        return true;

    }
	public static void main(String[] args) {
		String s = "egg", t = "add";
		System.out.print("Is Isomorphic : "+isIsomorphic(s, t));

	}

}

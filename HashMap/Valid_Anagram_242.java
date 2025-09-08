package HashMap;
import java.util.*;
public class Valid_Anagram_242 {
	public static  boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch,1);
            }
            else
            {
                int freq = map.remove(ch);
                map.put(ch, freq+1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(!map.containsKey(ch) || map.get(ch)==0)
            {
                return false;
            }
            else
            {
                int freq = map.remove(ch);
                map.put(ch, freq-1);
            }
        }
        return true;
    }
	public static void main(String[] args) {
	
		var s = "anagram";
		var t = "nagaram";
		System.out.println(isAnagram(s, t));
	}

}

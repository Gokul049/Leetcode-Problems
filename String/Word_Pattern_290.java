package String;
import java.util.*;
public class Word_Pattern_290 {
	public static boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();

        String sarr[] = s.split(" ");
        if(pattern.length()!=sarr.length) return false;
        for(int i=0;i<pattern.length();i++)
        {
            
            if(map.containsKey(pattern.charAt(i)))
            {
                if(!map.get(pattern.charAt(i)).equals(sarr[i]))
                    return false;
            }
            else
            {
                if(seen.contains(sarr[i]))
                    return false;
                map.put(pattern.charAt(i), sarr[i]);
                seen.add(sarr[i]);
            }
        }
        return true;
    }
	public static void main(String[] args) {
		var pattern = "abba";
		var s = "dog cat cat dog";
		System.out.println(wordPattern(pattern, s));

	}

}

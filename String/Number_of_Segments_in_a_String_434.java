package String;

public class Number_of_Segments_in_a_String_434 {
	public static int countSegments(String s) {
        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ' && (i==0 || s.charAt(i-1)==' ') )
                count++;
        }
        return count;
    }
	public static void main(String[] args) {
		var s = "Hello, my name is John s f";
		System.out.print(countSegments(s));

	}

}

package String;

public class Reverse_String_II_541 {
	public static String reverseStr(String s, int k) {
        char carr[] = s.toCharArray();
        int i=0;
        while(i < s.length())
        {
            int j = Math.min(i+ k-1, s.length()-1);
            reverse(carr, i, j);
            i += 2 *k;
        }
        return new String(carr);

    }
    public static void reverse(char arr[], int i, int j)
    {
        while(i <=j)
        {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
	public static void main(String[] args) {
		var s = "abcdefg";
		var k = 2;
		System.out.println("Original String : "+s+"\nResult Reverse String : "+reverseStr(s, k));

	}

}

package String;

public class Reverse_Vowels_of_a_String_345 {
	private static final boolean[] V = new boolean[128];
    static {
        for (char c : "aeiouAEIOU".toCharArray()) 
            V[c] = true;
    }
    private static boolean isVowel(char c) {
        return c < V.length && V[c];
    }

    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            while (left < right && !isVowel(arr[left])) 
                left++;
            while (left < right && !isVowel(arr[right])) 
                right--;
            char t = arr[left]; 
            arr[left] = arr[right]; 
            arr[right] = t;
            left++; 
            right--;
        }
        return new String(arr);
    }
	public static void main(String[] args) {
		var s = "IceCreAm";
		System.out.println(reverseVowels(s));

	}

}

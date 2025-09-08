package String;

public class Reverse_Vowels_of_a_String_345 {
	static boolean isVowel(char c)
	{
		for(char ch : "aeiouAEIOU".toCharArray())
		{
			if(c==ch)
				return true;
		}
		return false;
		
	}
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int st = 0, end = arr.length - 1;
        while (st < end) 
        {
            if(isVowel(arr[st]) && isVowel(arr[end]))
            {
            	swap(arr, st, end);
            	st++;
            	end--;
            }
            else if(!isVowel(arr[st]))
            {
            	st++;
            }
            else if(!isVowel(arr[end]))
            {
            	end--;
            }
            else
            {
            	st++;
            	end--;
            }
        }
        return new String(arr);
    }
    
    static void swap(char[] arr, int i, int j)
    {
    	char temp = arr[i];
    	arr[i] = arr[j];
    	arr[j] = temp;
    }
	public static void main(String[] args) {
		var s = "IceCreAm";
		System.out.println(reverseVowels(s));

	}

}

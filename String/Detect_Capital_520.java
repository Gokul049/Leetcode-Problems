package String;

public class Detect_Capital_520 {
	public static boolean detectCapitalUse(String word) {
	       if(word.equals(word.toUpperCase())) return true;
	       if(word.equals(word.toLowerCase())) return true;
	       if(word.equals(word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase())) return true;
	       return false;
	    }
	public static void main(String[] args) {
		var w ="USA";
		System.out.println(detectCapitalUse(w));

	}

}

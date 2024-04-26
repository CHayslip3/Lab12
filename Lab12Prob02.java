
public class Lab12Prob02 {

	public static void main(String[] args) {
	}
	
	public static String reverseString(String s) {
		if(s.length() == 1) {
			return s;
		}
		else {
			return s.substring(s.length()-1, s.length()) + reverseString(s.substring(0, s.length()-1));	
		}
		
	}

}

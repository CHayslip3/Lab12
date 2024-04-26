
public class Lab12Prob03 {

	public static void main(String[] args) {
		System.out.print(reverseString("Apple"));
	}
	
	public static String reverseString(String s) {
			return reverseString(s, s.length()-1);
		
	}
	
	public static String reverseString(String s, int i) {
		if(i == 0) { //base case
			return ""+s.charAt(0);
		}
		else {
			return s.charAt(i) + reverseString(s, i-1);
		}
	}
}

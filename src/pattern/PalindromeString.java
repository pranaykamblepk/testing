package pattern;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Forward="ganesh";
		String Reveresed="";
		for (int i = Forward.length()-1; i >= 0; i--) {
			Reveresed=Reveresed+Forward.charAt(i);
		}
		if (Forward.equals(Reveresed)) {
			System.out.println(Forward+" String is palindrome");
		} else {
			System.out.println(Forward+" String is not palindrome");
		}

	}

}

package pattern;

public class ReverseString {

	public static void main(String[] args) {
		String Forward="kaiwalya";
		String Reveresed="";
		for (int i = 7; i >= 0; i--) {
			Reveresed=Reveresed+Forward.charAt(i);
			System.out.println(Reveresed);
		}
	}
}

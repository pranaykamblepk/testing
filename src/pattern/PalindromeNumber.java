package pattern;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12321;
		int b,c=0;
		for (int i = a; i >0; i=i/10) {
			b=i%10;
			c=c*10+b;
			System.out.println(c);
		}
		if (a==c) {
			System.out.println("No is palindrome");
		} else {
			System.out.println("No is not palindrome");
		}


	}

}

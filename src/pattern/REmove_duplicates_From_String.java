package pattern;

import java.util.LinkedHashSet;

public class REmove_duplicates_From_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A="Vaishali Ganesh Pranay";
		System.out.println(A);
		LinkedHashSet<Character> B = new LinkedHashSet<>();
		for (int i = 0; i <=A.length()-1; i++) {
			B.add(A.charAt(i));		
		}
		System.out.println(B);
		String C = B.toString();
		System.out.println(C+"");
		

	}
}

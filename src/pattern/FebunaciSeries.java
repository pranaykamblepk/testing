package pattern;

public class FebunaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int c;
		System.out.println(a+"\n"+b);
		for (int i = 0; i <=10; i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		// a b c
		//   a b c
		//     a b c
		// 0 1 1 2 3 5 8 13 21 34
		//

	}

}

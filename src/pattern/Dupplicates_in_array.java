package pattern;

public class Dupplicates_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []A= {"Swati","Ganesh","Swati","Leppy"};
		int C=0;
		for (int i = 0; i < A.length; i++) {//to specify what to check
			for (int j = 0; j < A.length; j++) {//whom to check
				if(A[i].equals(A[j]) && i!=j) {
					C++;
				}
			}
		}
		System.out.println(C);

	}

}

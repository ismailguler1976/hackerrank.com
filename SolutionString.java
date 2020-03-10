package guler.solutions;
import java.util.Scanner;

public class SolutionString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		System.out.println(A.length()+B.length());
		String large = "No";
		if(A.compareTo(B)>0) {
			large = "Yes";
		}
		System.out.println(large);
		
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " " 
				+ B.substring(0,1).toUpperCase() + B.substring(1));

	}
}

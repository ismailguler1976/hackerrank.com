package guler.solutions;
import java.util.Scanner;

public class SolutionString5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		/* Enter your code here. Print output to STDOUT. */
		String rev = "";
		int len = A.length();
		Character a = null;
		for (int i = 0; i < len; i++) {
			rev += A.charAt(len - i-1);

		}
		if(A.equals(rev)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}

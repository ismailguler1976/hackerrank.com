package guler.solutions;
import java.util.Scanner;

public class SolutionConditional3 {

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int i = 0; i <n; i++) {
			String s = scanner.nextLine();
			for (int j = 0; j < s.length(); j=j+2) {
				System.out.print(s.charAt(j));
			}
			System.out.print(" ");
			for (int j = 1; j < s.length(); j=j+2) {
				System.out.print(s.charAt(j));
			}
			System.out.println("");
		}
       
    }
}

package guler.solutions;
import java.util.Scanner;

public class SolutionArrays1 {
	
	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.close();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}
		for (int i = 0; i < n; i++) {
			System.out.print(arr[n-i-1] + " ");
		}

		
	}
}

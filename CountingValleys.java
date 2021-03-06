package ig.hackerrank.solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	// Complete the countingValleys function below.
	static int countingValleys(int n, String s) {
		int result = 0;
		boolean donwInValley = false;
		int valley = 0;
		for (int i = 0; i < n; i++) {
			if (s.charAt(i) == 'D') {
				donwInValley = true;
				result--;
			} else {
				result++;
				if (donwInValley && result == 0) {
					valley++;
					donwInValley = false;
				}
				
			}
		}

		return valley;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		//BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println(result);

		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}
}

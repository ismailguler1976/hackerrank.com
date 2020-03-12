package ig.hackerrank.solution;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		long strLen = s.length();
		long numOfAinStr = s.length() - s.replace("a", "").length();
		long ocrOfA = n / strLen;
		long dif = n - (ocrOfA * strLen);
		System.out.println(dif);
		long rem = 0;
		if (dif > 0) {
			for (int i = 0; i < dif; i++) {
				if (s.charAt(i) == 'a') {
					rem++;
				}
			}
		}
		return ocrOfA * numOfAinStr + rem;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		String s = scanner.nextLine();

		long n = scanner.nextLong();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long result = repeatedString(s, n);
		System.out.println(result);

		scanner.close();
	}
}

package ig.hackerrank.solution;

import java.io.IOException;
import java.util.Scanner;

public class JumpingOnClouds {
	static int jumpingOnClouds(int[] c) {

		int result = 0;

		if (c.length > 2) {
			for (int i = 0; i < c.length - 2; i++) {
				if (c[i + 2] == 0) {
					i++;
				}
				result++;
			}
			if ((c[c.length - 3] == 1) && (c[c.length - 2] == 0)) {
				result++;
			}
		} else {
			result = 1;
		}

		return result;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] c = new int[n];

		String[] cItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

		System.out.println(result);

		scanner.close();
	}
}

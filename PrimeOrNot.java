package ig.hackerrank.solution;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int[] arr = new int[T];
		int i = 0;
		while (T-- > 0) {
			int data = sc.nextInt();
			arr[i++] = data;
		}
		for (int j = 0; j < arr.length; j++) {
			int num = arr[j];
			boolean prime = true;
			if (num < 2) {
				prime = false;

			} else {
				for (int k = 2; k < num / 2 +1 ; k++) {
					if (num % k == 0) {
						prime = false;
						break;
					}
				}
			}
			if (prime) {
				System.out.println("Prime");
			} else {
				System.out.println("Not prime");
			}
		}
		sc.close();

	}

}

package ig.hackerrank.solution;

import java.util.Scanner;

public class DateProccess {
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		

		Scanner scanner = new Scanner(System.in);
		String[] arrItemsD1 = scanner.nextLine().split(" ");
		String[] arrItemsD2 = scanner.nextLine().split(" ");
		scanner.close();

		int D1Y = Integer.parseInt(arrItemsD1[2]);
		int D1M = Integer.parseInt(arrItemsD1[1]);
		int D1D = Integer.parseInt(arrItemsD1[0]);

		int D2Y = Integer.parseInt(arrItemsD2[2]);
		int D2M = Integer.parseInt(arrItemsD2[1]);
		int D2D = Integer.parseInt(arrItemsD2[0]);

		int output = 0;
		if (D1Y > D2Y) {
			output = 10000;
		} else if (D1Y == D2Y) {
			if (D1M == D2M) {
				if (D1D > D2D) {
					output = ((D1D - D2D) * 15);
				}
			} else if (D1M > D2M) {
				output = ((D1M - D2M) * 500);
			}
		}
		System.out.println(output);

	}
}

package guler.solutions;
import java.util.Arrays;
import java.util.Scanner;

public class SolutionD2ArrayHourGlass {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		/*
		 * int[][] arr = new int[6][6];
		 * 
		 * 
		 * for (int i = 0; i < 6; i++) { String[] arrRowItems =
		 * scanner.nextLine().split(" ");
		 * scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		 * 
		 * for (int j = 0; j < 6; j++) { int arrItem = Integer.parseInt(arrRowItems[j]);
		 * arr[i][j] = arrItem; } }
		 */
		scanner.close();

		int[][] arr = { { 1, 1, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 }, { 1, 1, 1, 0, 0, 0 }, { 0, 0, 2, 4, 4, 0 },
				{ 0, 0, 0, 2, 0, 0 }, { 0, 0, 1, 2, 4, 0 } };
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum =  calculate(arr, i, j);
				if(sum > max) {
					max = sum;
				}
			}
		}
		System.out.println(max);
	}

	public static int calculate(int[][] arr, int row, int col) {
		int k = -1;
		int[][] a = new int[3][3];
		for (int i = row; i < row + 3; i++) {
			k++;
			int l = 0;
			for (int j = col; j < col + 3; j++) {
				a[k][l++] = arr[i][j];

			}
		}
		return getSum(a);
	}

	public static int getSum(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if ((i == 1) && ((j == 0) || (j == 2))) {

				} else {
					sum += arr[i][j];
				}
			}
		}
		return sum;
	}
}

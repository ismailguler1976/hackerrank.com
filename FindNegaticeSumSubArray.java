import java.util.Arrays;
import java.util.Scanner;

public class FindNegaticeSumSubArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		int[] arr = new int[n];

		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String[] arrItems = scan.nextLine().split(" ");
		scan.close();

		for (int i = 0; i < n; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		int negativeSum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				int[] sub = Arrays.copyOfRange(arr, i, j + 1);
				negativeSum += getNegatif(sub);
			}

		}
		System.out.println(negativeSum);

	}

	private static int getNegatif(int[] sub) {
		int sum = 0;
		for (int i = 0; i < sub.length; i++) {
			sum += sub[i];
		}
		return (sum < 0 ? 1 : 0);
	}

}

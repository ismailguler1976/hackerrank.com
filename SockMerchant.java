package ig.hackerrank.solution;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SockMerchant {

	// Complete the sockMerchant function below.
	static int sockMerchant1(int n, int[] ar) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < ar.length; i++) {
			int key = ar[i];
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}
		int pairs = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			pairs += (entry.getValue() / 2);
		}
		return pairs;
	}

	static int sockMerchant2(int n, int[] ar) {
		Set<Integer> colors = new HashSet<Integer>();
		int pairs = 0;
		for (int i = 0; i < ar.length; i++) {
			if (!colors.contains(ar[i])) {
				colors.add(ar[i]);
			} else {
				pairs++;
				colors.remove(ar[i]);
			}
		}
		return pairs;
	}
	public static int sockMerchant3(int n, int[] ar) {
		int pairs = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer item : ar) {
			if (map.remove(item) == null)
				map.put(item, 1);
			else {
				pairs = pairs + 1;
			}
		}
		return pairs;
	}
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant3(n, ar);
		System.out.println(result);
		/*
		 * bufferedWriter.write(String.valueOf(result)); bufferedWriter.newLine();
		 * 
		 * bufferedWriter.close();
		 */

		scanner.close();
	}


}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListOfArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		List<int[]> arrList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			String[] arrItems = scan.nextLine().split(" ");
			int n2 = Integer.parseInt(arrItems[0]);
			if(n2 > 0) {
				int[] arr = new int[n2];
				for (int j = 1; j <= n2; j++) {
					int arrItem = Integer.parseInt(arrItems[j]);
					arr[j-1] = arrItem;
				}
				arrList.add(i,arr);
			} else {
				arrList.add(i,null);
			}
			
		}

		int n3 = scan.nextInt();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String[] checkArr = new String[n3];
		
		for (int i = 0; i < n3; i++) {
			checkArr[i] = scan.nextLine();
			scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		}
		
		for(int a = 0 ; a<checkArr.length ; a++) {
			String[] items = checkArr[a].split(" ");
			int i = Integer.parseInt(items[0]);
			int j = Integer.parseInt(items[1]);
			int[] arr = arrList.get(i-1);
			if(arr != null && arr.length >j-1) {
				System.out.println(arr[j-1]);
			} else {
				System.out.println("ERROR!");
			}
		}

		scan.close();

	}

}

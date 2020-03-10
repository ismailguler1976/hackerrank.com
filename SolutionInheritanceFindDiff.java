package guler.solutions;
import java.util.Scanner;

class Difference {
	private int[] elements;
	public int maximumDifference ;

	public Difference(int[] elements) {
		this.elements = elements;
	}

	public int computeDifference() {
		this.maximumDifference = 0;

		for (int i = 0; i < elements.length - 1; i++) {
			for (int j = 1; j < elements.length; j++) {
				int dif = Math.abs(elements[i] - elements[j]);
				if (dif > this.maximumDifference) {
					this.maximumDifference = dif;
				}
			}

		}
		return this.maximumDifference;
	}

	// Add your code here

} //

public class SolutionInheritanceFindDiff {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}

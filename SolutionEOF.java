package guler.solutions;
import java.util.Scanner;

public class SolutionEOF {

	public static void main(String[] argh) {

		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		while (true) {
			String s = sc.nextLine();
			System.out.println(i++ + " " + s);
			if(!sc.hasNext()){
				break;
			}
		}
		sc.close();
	}
}

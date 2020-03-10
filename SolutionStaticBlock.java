package guler.solutions;
import java.util.Scanner;

public class SolutionStaticBlock {
	static boolean flag = true;
	static int B, H;

	static {

		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		sc.nextLine();
		H = sc.nextInt();
		sc.close();
		if (B < 0 || H < 0) {
			flag = false;
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			

		} else  {
			flag = true;
			
		}
	}

	public static void main(String[] argh) {
		if(flag) {
			System.out.println(B*H);
		}

	}
	
	
	/*
	 * if ((B <= 0 && H <= 0) || (B >= 0 && H >= 0)) { flag = true;
	 * 
	 * } else if ((B <= 0 && H >= 0) || (B >= 0 && H <= 0)) { flag = false;
	 * System.out.println("java.lang.Exception: Breadth and height must be positive"
	 * ); }
	 */
}

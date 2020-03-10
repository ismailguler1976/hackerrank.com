package guler.solutions;
import java.util.Scanner;

public class SolutionDataType1 {

	
	public static void main(String[] args) {

		        int i = 4;
		        double d = 4.0;
		        String s = "HackerRank ";
				
		Scanner scan = new Scanner(System.in);
		
		int newIntI = scan.nextInt();
		double newDoubleD = scan.nextDouble();
		scan.nextLine();
		String newStringS = scan.nextLine();
		System.out.println(i+newIntI);
		System.out.println(d+newDoubleD);
		System.out.println(s+newStringS);
		scan.close();
	}

}

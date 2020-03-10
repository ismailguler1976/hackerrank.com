package guler.solutions;
import java.util.Scanner;

public class SolutionLoopII {

	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            printSerie(a,b,n);
           
        }
        in.close();
    }

	private static void printSerie(int a, int b, int n) {
		int sum=0;
		for (int i = 0; i < n; i++) {
			sum += (int) Math.pow(2,i)*b; 
			System.out.print((sum +a ) + " ");
		}
		System.out.println();
		
		
		
	}
}

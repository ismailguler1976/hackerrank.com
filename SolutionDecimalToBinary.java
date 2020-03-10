package guler.solutions;
import java.util.Scanner;

public class SolutionDecimalToBinary {

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        int n = scanner.nextInt();
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        String s = Integer.toBinaryString(n);
	        System.out.println(s);
	        int cnt=0;
	        int max=0;
	        boolean r = false;
	        for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '1') {
					if(r) {
						cnt++;
					} else {
						if(cnt>max) {
							max=cnt;
						}
						cnt=1;
					}
					r=true;
				} else {
					r=false;
				}
			}
	        if(cnt>max) {
				max=cnt;
			}
	        System.out.println(max);
	        scanner.close();
	    }
}

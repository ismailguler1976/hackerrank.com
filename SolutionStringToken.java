package guler.solutions;
import java.util.Scanner;

public class SolutionStringToken {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        boolean valid = s.matches("[A-Za-z !,?._'@]+");
        if(valid) {
        	String[] arr=s.split("[\\s!,?._':;@]+");
            System.out.println(arr.length);
            for (int i = 0; i < arr.length; i++) {
    			System.out.println(arr[i]);
    		}
        } else {
        	 System.out.println(0);
        }
        
        scan.close();
    }
}

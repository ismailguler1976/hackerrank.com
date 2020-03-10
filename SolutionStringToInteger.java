package guler.solutions;
import java.util.Scanner;

public class SolutionStringToInteger {

    public static void main(String[] args) {
    	 Scanner in = new Scanner(System.in);
         String S = in.next();
         in.close();
         
         try {
        	 int i = Integer.parseInt(S);
        	 System.out.println(i);
         }catch (NumberFormatException e) {
			System.out.println("Bad String");
		}

    }
}

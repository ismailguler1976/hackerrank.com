package guler.solutions;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class SolutionStringPatternCompile {
	private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
		int testCases = Integer.parseInt(scan.nextLine());
		String pattern="";
		while(testCases-->0){
			try {
			pattern = scan.nextLine();
			}catch (NoSuchElementException e) {
				System.out.println("err");
			}
			try {
				Pattern p = Pattern.compile(pattern);
				System.out.println("Valid");
			}catch (PatternSyntaxException e) {
				System.out.println("Invalid");
			}
		}
        scan.close();
    }
}

package ig.hackerrank.solution;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* According to the policy, 
 * a username is considered valid if all the following constraints are satisfied:
 * 
 * The username consists of 8 to 30  characters inclusive. 
 * If the username consists of less than 8 or greater than 30 characters, 
 * then it is an invalid username.
 * The username can only contain alphanumeric characters and underscores (_). 
 * Alphanumeric characters describe the character set 
 * consisting of lowercase characters [a-z] , uppercase characters [A-Z], 
 * and digits[0-9] . 
 * The first character of the username must be an alphabetic character, 
 * i.e., either lowercase character [a-z] or uppercase character [A-Z].
*/
public class ValidUsernameRegex {
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int n = Integer.parseInt(scan.nextLine());
		while (n-- != 0) {
			String userName = scan.nextLine();

			if (userName.matches("^(?=.{8,30}$)(?![_0-9])[a-zA-Z0-9_]+$")) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}

}

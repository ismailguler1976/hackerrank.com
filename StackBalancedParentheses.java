import java.util.Scanner;
import java.util.Stack;

public class StackBalancedParentheses {

	public static void main(String[] argh) {
		Scanner sc = new Scanner(System.in);

		while (sc.hasNext()) {
			String input = sc.next();
			// Complete the code
			char[] ch = input.toCharArray();

			System.out.println(isBalanced(ch));
		}
	}

	public static boolean isBalanced(char[] ch) {
		Stack<Character> charStack = new Stack<Character>();
		for (Character c : ch) {
			if (!charStack.isEmpty()) {
				char pair = charStack.peek();
				boolean remove = false;
				switch (c) {
				case '}':
					if (pair == '{') {
						remove = true;
					}
					break;
				case ']':
					if (pair == '[') {
						remove = true;
					}
					break;
				case ')':
					if (pair == '(') {
						remove = true;
					}
					break;
				default:
					break;
				}
				if (remove) {
					charStack.pop();
					
				} else {
					charStack.push(c);
				}
			} else {
				charStack.push(c);
			}
		}
		if (charStack.isEmpty()) {
			return true;
		}
		return false;
	}
}

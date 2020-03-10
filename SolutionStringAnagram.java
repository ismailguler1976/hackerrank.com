package guler.solutions;
import java.util.Scanner;

public class SolutionStringAnagram {

	static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() != b.length()) {
			return false;
		}
		a = a.toLowerCase();
		b = b.toLowerCase();

		java.util.HashMap<Character, Integer> aHash = new java.util.HashMap<Character, Integer>();

		java.util.HashMap<Character, Integer> bHash = new java.util.HashMap<Character, Integer>();

		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();

		for (int i = 0; i < ac.length; i++) {
			if (aHash.containsKey(ac[i])) {
				aHash.put(ac[i], aHash.get(ac[i]) + 1);
			} else {
				aHash.put(ac[i], 1);
			}
		}

		for (int i = 0; i < bc.length; i++) {
			if (bHash.containsKey(bc[i])) {
				bHash.put(bc[i], bHash.get(bc[i]) + 1);
			} else {
				bHash.put(bc[i], 1);
			}
		}

		if (aHash.equals(bHash)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}

}

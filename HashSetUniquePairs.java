import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSetUniquePairs {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

//Write your code here
		Set<String> mySet = new LinkedHashSet<String>();
		for (int i = 0; i < t; i++) {
			String p = pair_left[i] + " " + pair_right[i];
			mySet.add(p);
			System.out.println(mySet.size());
		}
	}
}

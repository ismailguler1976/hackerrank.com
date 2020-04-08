package hac.primeChecker;
import static java.lang.System.in;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

class Prime {

	public void checkPrime(int... n) {
		String out="";
		for (int m : n) {
			boolean prime = true;
			if (m > 2) {
				for (int i = 2; i < (m / 2) + 1; i++) {
					if (m % i == 0) {
						prime = false;
						break;
					}
				}
			} else if (m < 2) {
				prime = false;
			}
			if (prime) {
				if (out.isEmpty()) {
					out += m;
				} else {
					out += " " + m;
				}

			}
		}
		System.out.println(out);
	}
}
public class PrimeChecker {
	
	public static void main(String[] args) {

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			int n1 = Integer.parseInt(br.readLine());
			int n2 = Integer.parseInt(br.readLine());
			int n3 = Integer.parseInt(br.readLine());
			int n4 = Integer.parseInt(br.readLine());
			int n5 = Integer.parseInt(br.readLine());
			Prime ob = new Prime();
			ob.checkPrime(n1);
			ob.checkPrime(n1, n2);
			ob.checkPrime(n1, n2, n3);
			ob.checkPrime(n1, n2, n3, n4, n5);
			Method[] methods = Prime.class.getDeclaredMethods();
			Set<String> set = new HashSet<>();
			boolean overload = false;
			for (int i = 0; i < methods.length; i++) {
				if (set.contains(methods[i].getName())) {
					overload = true;
					break;
				}
				set.add(methods[i].getName());

			}
			if (overload) {
				throw new Exception("Overloading not allowed");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}

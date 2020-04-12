package hac.bigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String firstNumberString = sc.nextLine();
		String secondNumberString = sc.nextLine();
		sc.close();

		BigInteger firstBigNumber = new BigInteger(firstNumberString);
		BigInteger secondBigNumber = new BigInteger(secondNumberString);
		
		System.out.println(firstBigNumber.add(secondBigNumber));
		System.out.println(firstBigNumber.multiply(secondBigNumber));


	}

}

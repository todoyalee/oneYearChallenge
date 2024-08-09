package ippoForce;

import java.util.Scanner;

public class volg {
	public static void main(String[] args) {

		// read the numbers

		Scanner sn = new Scanner(System.in);

		int a = sn.nextInt();
		int b = sn.nextInt();
		int c = a + b;

		// remove the zeros

		int aWithoutZero = without(a);
		int bWithoutZero = without(b);
		int cWithoutZero = without(c);

		// check

		if (aWithoutZero + bWithoutZero == cWithoutZero) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static int without(int a) {

		String s = Integer.toString(a);

		String ss = s.replace("0", "");

		return Integer.parseInt(ss);

	}
}
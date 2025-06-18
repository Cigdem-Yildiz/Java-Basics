package bi_to_dec;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BinaryToDeci {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		String binary = in.nextLine();

		// Write an answer using System.out.println()
		// To debug: System.err.println("Debug messages...");
		StringTokenizer st = new StringTokenizer(binary);
		int decimal = 0, carp = st.countTokens() - 1;
		while (st.hasMoreTokens()) {
			String bi = st.nextToken();
			if (bi.equals(1) || bi.equals("true") || bi.equals("yes") || bi.equals("one") || bi.equals("1")) {
				decimal += Math.pow(2, carp);
			}
			carp--;
		}

		System.out.println(decimal);
		in.close();
	}
}

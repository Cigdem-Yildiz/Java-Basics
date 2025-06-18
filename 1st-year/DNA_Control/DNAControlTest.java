package dna_control;

import java.util.Scanner;

public class DNAControlTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String dna1, dna2;

		System.out.print("Enter the first dna: ");
		dna1 = scanner.next();
		System.out.print("Enter the second dna: ");
		dna2 = scanner.next();

		DNAControl dnaControl = new DNAControl(dna1, dna2);
		String part = dnaControl.controlAllSubs();

		if (part == null) {
			System.out.println("There are no common parts.");
		} else {
			System.out.println("Common parts: " + part);
		}

		scanner.close();
	}

}

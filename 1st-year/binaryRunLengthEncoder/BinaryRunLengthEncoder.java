package binaryRunLengthEncoder;

import java.util.Scanner;

public class BinaryRunLengthEncoder {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a message: ");
		String message = in.nextLine();

		String binaryMsg = messageToBinary(message);
		String encodedMsg = encodeBinary(binaryMsg);

		System.out.println(encodedMsg);

		in.close();
	}

	public static String messageToBinary(String message) {
		StringBuilder binaryMsg = new StringBuilder();

		for (int i : message.getBytes()) {
			String binary = String.format("%7s", Integer.toBinaryString(i)).replace(" ", "0");
			binaryMsg.append(binary);
		}

		return binaryMsg.toString();

	}

	public static String encodeBinary(String biMsg) {
		StringBuilder encoded = new StringBuilder();

		for (int i = 0, count = 1; i < biMsg.length(); i += count) {
			char currentBit = biMsg.charAt(i);
			count = 1;

			while (i + count < biMsg.length() && biMsg.charAt(i + count) == currentBit) {
				count++;
			}

			if (currentBit == '0') {
				encoded.append("00 ");
			} else {
				encoded.append("0 ");
			}

			encoded.append("0".repeat(count)).append(" ");
		}

		return encoded.toString().trim();
	}

}


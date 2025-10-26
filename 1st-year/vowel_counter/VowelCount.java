package vowel_counter;

import java.util.Scanner;

public class VowelCount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String sentence;
		int count = 0, i = 0;

		System.out.print("Enter a sentence: ");
		sentence = scanner.nextLine();
		char letter;

		while (i < sentence.length()) {
			letter = sentence.charAt(i);
			letter = Character.toLowerCase(letter);

			if ("aeiouöü".indexOf(letter) != -1) {
				count++;
			}
			i++;
		}
		if(count==1)
			System.out.println("There is 1 vowel in \"" + sentence + "\"");
		else
			System.out.println("There are " + count + " vowels in \"" + sentence + "\"");

		scanner.close();
	}

}

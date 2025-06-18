package hangman_game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {

	public static void main(String[] args) {
		System.out.println("***********************");
		System.out.println("Welcome to Java Hangman");
		System.out.println("***********************");

		String[] wordArray = { "orange", "yellow", "purple", "magenta", "green", "brown", "beige", "white" };
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String word = wordArray[random.nextInt(wordArray.length)];
		int wrongGuess = 0;

		ArrayList<Character> wordState = new ArrayList<Character>();
		ArrayList<Character> guessedLetters = new ArrayList<Character>();
		for (int i = 0; i < word.length(); i++) {
			wordState.add('_');
		}

		while (true) {
			for (char c : wordState) {
				System.out.print(c + " ");
			}

			System.out.print("\nEnter your guess: ");
			char letter = scanner.next().toLowerCase().charAt(0);

			if (guessedLetters.contains(letter)) {
				System.out.println("\nYou already guessed that letter. Try again!\n");
				continue;
			}
			guessedLetters.add(letter);

			if (word.indexOf(letter) != -1) {
				System.out.println("Correct guess!");
				for (int i = 0; i < word.length(); i++) {
					if (word.charAt(i) == letter) {
						wordState.set(i, letter);
					}
				}
				if (!wordState.contains('_')) {
					System.out.println("\nCongrats. You Win!");
					System.out.println("The word was '" + word + "'");
					break;
				}
			} else {
				wrongGuess++;
				System.out.println("Wrong guess!");
			}

			displayHangman(wrongGuess);

			if (wrongGuess == 6) {
				System.out.println("Game Over. You lost!");
				System.out.println("The word was '" + word + "'");
				break;
			}

		}

		scanner.close();
	}

	static void displayHangman(int wrong) {
		switch (wrong) {
		case 0:
			System.out.println("\n\n");
			break;
		case 1:
			System.out.println("""
					O


					  """);
			break;
		case 2:
			System.out.println("""
					O
					|

					  """);
			break;
		case 3:
			System.out.println("""
					 O
					/|

					""");
			break;
		case 4:
			System.out.println("""
					 O
					/|\\

					""");
			break;
		case 5:
			System.out.println("""
					 O
					/|\\
					/
					""");
			break;
		case 6:
			System.out.println("""
					 O
					/|\\
					/ \\
					""");
			break;
		default:
			System.out.print("");
		}
	}

}

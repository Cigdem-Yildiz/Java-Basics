package rock_paper_scissors;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] choices = { "rock", "paper", "scissors" };
		String confirm = "yes";
		String moveUser;
		String moveComp;
		int comp, win = 0, total = 0;

		do {
			System.out.print("Enter your move(rock/paper/scissors): ");
			moveUser = scanner.nextLine().toLowerCase();

			if (!moveUser.equals("rock") && !moveUser.equals("paper") && !moveUser.equals("scissors")) {
				System.out.println("Invalid choice!");
				continue;
			}

			comp = (int) (Math.random() * 3);
			moveComp = choices[comp];
			System.out.println("Computer choice: " + moveComp);
			total++;

			if (moveUser.endsWith(moveComp)) {
				System.out.println("Its a tie!");
			} else if (moveUser.equals("paper") && moveComp.equals("rock")
					|| moveUser.equals("rock") && moveComp.equals("scissors")
					|| moveUser.equals("scissors") && moveComp.equals("paper")) {
				System.out.println("You won!");
				win++;
			} else {
				System.out.println("You lost!");
			}

			System.out.print("Play again(yes/no): ");
			confirm = scanner.nextLine().toLowerCase();

		} while (confirm.equals("yes"));

		System.out.println("\nYou played " + total + " time/s. You won " + win + " of them.");
		System.out.println("\nGame is over!\nThank you for playing!");

		scanner.close();
	}

}

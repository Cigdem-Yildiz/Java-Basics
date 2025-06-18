import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String adj1;
		String noun;
		String adj2;
		String verb;
		String adj3;

		System.out.print("Enter an adjective: ");
		adj1 = scanner.nextLine();
		System.out.print("Enter a noun(preferably an animal or a person): ");
		noun = scanner.nextLine();
		System.out.print("Enter an adjective: ");
		adj2 = scanner.nextLine();
		System.out.print("Enter a verb: ");
		verb = scanner.nextLine();
		System.out.print("Enter an adjective: ");
		adj3 = scanner.nextLine();

		System.out.println("Today my friends and i went to a " + adj1 + " zoo.");
		System.out.println("There was a " + noun + " in a cage.");
		System.out.println(noun + " was " + adj2 + " and " + verb + ".");
		System.out.println("I was so " + adj3);

		scanner.close();
	}

}

package alarm_clock;

public class AlarmClock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalTime alarmTime = null;

		while (alarmTime == null) {
			System.out.print("Enter the alarm time(HH:MM:SS): ");
			String inputTime = scanner.nextLine();

			try {
				alarmTime = LocalTime.parse(inputTime, formatter);
			} catch (DateTimeParseException e) {
				System.out.println("Wrong format, try again!");
			}
			
			
		}
	}

}

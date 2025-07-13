package alarm_clock;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
		LocalTime alarmTime = null;
		String musicPath = "C:\\Users\\_DELL\\Desktop\\4 O'CLOCK - R&V.wav";

		while (alarmTime == null) {

			try {
				System.out.print("Enter the alarm time(HH:MM): ");
				String inputTime = scanner.nextLine();
				alarmTime = LocalTime.parse(inputTime, formatter);
				System.out.println("Alarm time set for " + alarmTime);

			} catch (DateTimeParseException e) {
				System.out.println("Wrong format, try again!");
			}

		}

		AlarmClock alarmClock = new AlarmClock(alarmTime, musicPath);
		Thread alarmThread = new Thread(alarmClock);
		alarmThread.start();

		scanner.close();
	}

}

package alarm_clock;

import java.time.LocalTime;

public class AlarmClock implements Runnable {
	private String musicPath;
	private LocalTime alarmTime;

	AlarmClock(LocalTime alarmTime, String musicPath) {
		this.alarmTime = alarmTime;
		this.musicPath = musicPath;
	}

	@Override
	public void run() {

		while (LocalTime.now().isBefore(alarmTime)) {
			try {
				Thread.sleep(1000);
				LocalTime lTime = LocalTime.now();

				System.out.printf("\r%02d:%02d:%02d", lTime.getHour(), lTime.getMinute(), lTime.getSecond());
				System.out.flush();

			} catch (InterruptedException e) {
				System.out.println("Thread was interrupted.");
			}
		}
		System.out.println("\n*Alarm Noise*");

	}

}

package alarm_clock;

import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class AlarmClock implements Runnable {
	private final String musicPath;
	private final LocalTime alarmTime;
	private final Scanner scanner;

	AlarmClock(LocalTime alarmTime, String musicPath, Scanner scanner) {
		this.alarmTime = alarmTime;
		this.musicPath = musicPath;
		this.scanner = scanner;
	}

	@Override
	public void run() {
		if(LocalTime.now().isAfter(alarmTime)) {
			System.out.println("This time already passed for today! Please enter a valid time.");
			return;
		}

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
		playSound(musicPath);

	}

	private void playSound(String musicPath) {
		File musicFile = new File(musicPath);

		try (AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(musicFile)) {
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();

			System.out.print("\nPress *Enter* to stop the alarm: ");
			scanner.nextLine();
			clip.stop();
			scanner.close();

		} catch (UnsupportedAudioFileException e) {
			System.out.println("Audio file format is not supported");
		} catch (LineUnavailableException e) {
			System.out.println("Audio is unavailable");
		} catch (IOException e) {
			System.out.println("Error reading audio file");
		}
	}

}

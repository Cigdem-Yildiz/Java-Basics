package music_player;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.sampled.*;

public class MusicPlayerMain {

	public static void main(String[] args) throws IOException {

//		String filePath = "4 O'CLOCK - R&V.wav";
//		File file = new File(filePath);
		String directoryPath = "C:\\Users\\_DELL\\Music";
		File directory = new File(directoryPath);
		String[] musicList = MusicList(directory);

		if (musicList == null || musicList.length == 0) {
			System.out.println("No music files found.");
			return;
		}

		int songNo = 0;
		Scanner scanner = new Scanner(System.in);
		Clip clip = null;
		AudioInputStream audioStream = null;

		while (true) {

			try {
				if (clip != null && clip.isOpen()) {
					clip.close();
				}
				if (audioStream != null) {
					audioStream.close();
				}

				File file = new File(directory, musicList[songNo]);
				audioStream = AudioSystem.getAudioInputStream(file);

				clip = AudioSystem.getClip();
				clip.open(audioStream);

				String response = "";

				while (true) {
					System.out.println("\nNow selected: " + file.getName());
					System.out.println("\nP = Play");
					System.out.println("S = Stop");
					System.out.println("R = Reset");
					System.out.println("N = Next Song");
					System.out.println("F = Former Song");
					System.out.println("Q = Quit");
					System.out.print("Enter your choice: ");

					response = scanner.next().toUpperCase();

					switch (response) {
					case "P": {
						clip.start();
						System.out.println("Playing...");
						break;
					}
					case "S": {
						clip.stop();
						System.out.println("Stopped.");
						break;
					}
					case "R": {
						clip.setMicrosecondPosition(0);
						System.out.println("Resetted to beginning.");
						break;
					}
					case "N": {
						songNo = (songNo + 1) % musicList.length;
						System.out.println("Next song selected.");
						break;
					}
					case "F": {
						songNo = (songNo - 1 + musicList.length) % musicList.length;
						System.out.println("Previous song selected.");
						break;
					}
					case "Q": {
						clip.stop();
						clip.close();
						scanner.close();
						System.out.println("Bye!");
						System.exit(0);
						;
					}

					default:
						System.out.println("Invalid choice");
					}
					if (response.equals("N") || response.equals("F")) {
						break; // bu break iç while döngüsünden çıkmak için
					}

				}

			} catch (UnsupportedAudioFileException e) {
				System.out.println("Audio file is not supported");
			} catch (LineUnavailableException e) {
				System.out.println("Unable to access audio resource");
			} catch (IOException e) {
				System.out.println("Something went wrong");
			}
		}
	}

	static String[] MusicList(File f) {
		if (!f.isDirectory()) {
			System.out.println("File should be directory.");
			return null;
		}
		File[] musicListFile = f.listFiles();
		ArrayList<String> musicList = new ArrayList<String>();

		if (null != musicListFile) {
			for (File music : musicListFile) {
				if (music.isFile()) {
					String fileName = music.getName().toLowerCase();
					if (fileName.endsWith(".wav")) {
						musicList.add(music.getName());
					}
				}
			}
		}

		return musicList.toArray(new String[0]);
	}
}

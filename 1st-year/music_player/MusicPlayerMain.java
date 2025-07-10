package music_player;

import java.io.File;
import java.util.ArrayList;

public class MusicPlayerMain {

	public static void main(String[] args) {
		MusicPlayerInterface mpi = new MusicPlayerInterface();

		String directoryPath = "C:\\Users\\_DELL\\Music";
		File directory = new File(directoryPath);
		String[] musicList = MusicList(directory);

		if (musicList == null || musicList.length == 0) {
			System.out.println("No music files found.");
			return;
		}

		mpi.getMusicList(directory, musicList);
		mpi.playSong();

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


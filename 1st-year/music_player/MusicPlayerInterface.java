package music_player;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;

public class MusicPlayerInterface implements ActionListener {
	JFrame frame;
	JPanel mainPanel, buttonPanel;
	JButton previousButton, playPauseButton, nextButton;
	JLabel musicImg, songName;
	String[] musicList;
	File directory;
	int songNo = 0;
	Clip clip;
	AudioInputStream audioStream;
	boolean isPlaying = false;

	public MusicPlayerInterface() {
		ImageIcon frameIcon = new ImageIcon("C:\\Users\\_DELL\\Desktop\\mpIcon.png");

		mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(30, 20, 30, 20));

		musicImg = new JLabel();
		musicImg.setPreferredSize(new Dimension(300, 300));
		musicImg.setMaximumSize(new Dimension(300, 300));
		musicImg.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY));
		musicImg.setAlignmentX(Component.CENTER_ALIGNMENT);
		musicImg.setHorizontalAlignment(JLabel.CENTER);

		songName = new JLabel();
		songName.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
		songName.setPreferredSize(new Dimension(300, 25));
		songName.setAlignmentX(Component.CENTER_ALIGNMENT);

		buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 0));
		buttonPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		buttonPanel.setMaximumSize(new Dimension(300, 40));

		ImageIcon preIcon = new ImageIcon("C:\\Users\\_DELL\\Desktop\\angle-double-left.png");
		previousButton = new JButton(preIcon);
		previousButton.setFocusable(false);
		previousButton.setPreferredSize(new Dimension(40, 40));
		previousButton.setHorizontalAlignment(SwingConstants.CENTER);
		previousButton.setVerticalAlignment(SwingConstants.CENTER);
		previousButton.addActionListener(this);
		previousButton.setActionCommand("PREV");

		ImageIcon ppIcon = new ImageIcon("C:\\Users\\_DELL\\Desktop\\play-pause.png");
		playPauseButton = new JButton(ppIcon);
		playPauseButton.setFocusable(false);
		playPauseButton.setPreferredSize(new Dimension(40, 40));
		playPauseButton.setHorizontalAlignment(SwingConstants.CENTER);
		playPauseButton.setVerticalAlignment(SwingConstants.CENTER);
		playPauseButton.addActionListener(this);
		playPauseButton.setActionCommand("PLAY/PAUSE");

		ImageIcon nextIcon = new ImageIcon("C:\\Users\\_DELL\\Desktop\\angle-double-right.png");
		nextButton = new JButton(nextIcon);
		nextButton.setBackground(null);
		nextButton.setFocusable(false);
		nextButton.setPreferredSize(new Dimension(40, 40));
		nextButton.setHorizontalAlignment(SwingConstants.CENTER);
		nextButton.setVerticalAlignment(SwingConstants.CENTER);
		nextButton.addActionListener(this);
		nextButton.setActionCommand("NEXT");

		buttonPanel.add(previousButton);
		buttonPanel.add(playPauseButton);
		buttonPanel.add(nextButton);

		mainPanel.add(musicImg);
		mainPanel.add(songName);
		mainPanel.add(buttonPanel);
		mainPanel.setOpaque(true);
		mainPanel.revalidate();
		mainPanel.repaint();

		frame = new JFrame("Music Player");
		frame.setIconImage(frameIcon.getImage());
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setContentPane(mainPanel);
		frame.setVisible(true);

	}

	public void setMusicIcon(File file) {
		Icon icon = FileSystemView.getFileSystemView().getSystemIcon(file);
		musicImg.setIcon(icon);
	}

	public void setSongName(String songName) {
		this.songName.setText(songName);
	}

	public void getMusicList(File directory, String[] musicList) {
		this.directory = directory;
		this.musicList = musicList;
	}

	public void playSong() {
		try {
			if (clip != null && clip.isOpen())
				clip.close();
			if (audioStream != null)
				audioStream.close();

			File file = new File(directory, musicList[songNo]);
			setMusicIcon(file);
			setSongName(file.getName());
			audioStream = AudioSystem.getAudioInputStream(file);

			clip = AudioSystem.getClip();
			clip.open(audioStream);
			clip.start();
			isPlaying = true;

			clip.addLineListener(event -> {
				if (event.getType() == LineEvent.Type.STOP) {
					if (clip.getMicrosecondPosition() >= clip.getMicrosecondLength()) {
						playNext();
					}
				}
			});

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void playPrevious() {
		if (isPlaying && clip.getMicrosecondPosition() > 2_000_000) {
			clip.setMicrosecondPosition(0);
		} else {
			songNo = (songNo - 1 + musicList.length) % musicList.length;
			playSong();
		}

	}

	public void togglePlayPause() {
		if (clip != null) {
			if (isPlaying) {
				clip.stop();
				isPlaying = false;
			} else {
				clip.start();
				isPlaying = true;
			}
		}
	}

	public void playNext() {
		songNo = (songNo + 1) % musicList.length;
		playSong();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();

		switch (action) {
		case "PREV":
			playPrevious();
			break;

		case "PLAY/PAUSE":
			togglePlayPause();
			break;

		case "NEXT":
			playNext();
			break;

		}

	}

}

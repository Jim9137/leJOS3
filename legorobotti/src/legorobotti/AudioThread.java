package legorobotti;

import lejos.hardware.Button;

/**
 * Audio-s‰ie luokka jonka osana on audio-olio. Tarkoituksena toteuttaa
 * erillinen s‰ie ‰‰nille.
 * 
 * @author Jim
 *
 */

public class AudioThread extends Thread {

	private static int SABER_SWING = 2;
	private static int IMPERIAL_MARCH = 0;

	/**
	 * @param command
	 *            Komennot joilla voi vaihtaa s‰ikeen toiminnallisuutta
	 * @param audio
	 *            Audio-olio.
	 */
	private static int command = 0;
	private Audio audio = new Audio();

	/**
	 * Antaa komennon s‰ikeelle joka vaihtaa run() luokan toiminnallisuutta
	 * 
	 * @param c
	 *            komento
	 */
	public static void giveCommand(int c) {
		AudioThread.command = c;
	}

	public void stopSound() {
		audio.stopMusic();
	}

	/**
	 * Soittaa musiikkia riippuen komennosta ja soiko musiikki
	 */
	public void run() {
		while (Button.ESCAPE.isUp()) {
			switch (AudioThread.command) {
			case 0:
				if (!audio.isPlaying()) {
					audio.playMusic();
				}
			break;
			case 2:
				if (audio.isPlaying())
					audio.stopMusic();
				audio.playClip(Audio.SABERSW);
			}
		}

	}
}

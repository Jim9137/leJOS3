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

	/**
	 * @param audio
	 *            Audio-olio.
	 */
	private Audio audio = new Audio();

	/**
	 * Keskeytt‰‰ s‰ikeen toiston, eli pys‰ytt‰‰ musiikin. T‰m‰ aiheuttaa run()
	 * lopettamisen.
	 * Mahdollisia turvallisuus ongelmia.
	 */
	public void stopMusic() {
		interrupt();
	}

	/**
	 * Soittaa musiikkia kun olio on aloitettu start() musiikilla.
	 */
	public void run() {
		// Pyˆrit‰ niin kauan kunnes s‰ie on keskeytetty stopMusic(), sen j‰lkeen keskeyt‰ looppi.
		while (!Thread.currentThread().isInterrupted()) {
			try { // ...
				audio.playMusic();
			} catch (Exception consumed) {
				break;
			}
		}

	}
}

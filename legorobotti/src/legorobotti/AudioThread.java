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
	 * @param audio Audio-olio.
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
}

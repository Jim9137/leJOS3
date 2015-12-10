package legorobotti;

import lejos.hardware.Button;

/**
 * Audio-s‰ie luokka jonka osana on audio-olio.
 * Tarkoituksena toteuttaa erillinen s‰ie ‰‰nille.
 * @author Jim
 *
 */

public class AudioThread extends Thread {
	/**
	 * @param command Komennot joilla voi vaihtaa s‰ikeen toiminnallisuutta
	 * @param audio Audio-olio.
	 */
		private static int command = 0;
		private Audio audio = new Audio();
		/**
		 * Antaa komennon s‰ikeelle joka vaihtaa run() luokan toiminnallisuutta
		 * @param c komento
		 */
		public static  void giveCommand(int c) {
			AudioThread.command = c;
		}
		
		/**
		 * Soittaa musiikkia riippuen komennosta ja soiko musiikki
		 */
		public void run() {
			while(Button.ESCAPE.isUp()) {
				switch (AudioThread.command) {
					default: 
						if(!audio.isPlaying()) {
							audio.playMusic();
						}
				}
			}
			
		}
}

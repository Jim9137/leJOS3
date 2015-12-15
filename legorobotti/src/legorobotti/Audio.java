package legorobotti;

import java.io.File;
import lejos.hardware.*;
import lejos.hardware.lcd.LCD;
import lejos.utility.Delay;

/**
 * Äänentoisto liikkeen aikana.
 * 
 * @author hemmi_000
 *
 */

public class Audio {
	
	/**
	 * Toistaa valitun audio tiedoston.
	 * 
	 */

	public void playMusic() {
		final File soundFile = new File("The Imperial March.wav");
		Sound.playSample(soundFile);
		Delay.msDelay(500);
	}

	/**
	 * Toistaa kappaleen.
	 * 
	 * @param kappale
	 * 
	 */
	
	public void playMusic(String kappale) {
		final File soundFile = new File(kappale);
		Sound.playSample(soundFile, 100);
		Delay.msDelay(500);
	}

	/**
	 * Tarkistaa että toistaako ohjelma audiotiedostoa.
	 * 
	 */
	public boolean isPlaying() {
		if (Sound.getTime() != 0)
			return true;
		else
			return false;
	}

	/**
	 * Toistaa klipin.
	 * 
	 * @param klippi
	 * 
	 */
	public void playClip(String klippi) {
		final File soundFile = new File(klippi);
		Sound.playSample(soundFile, 100);
		Delay.msDelay(500);
	}
}
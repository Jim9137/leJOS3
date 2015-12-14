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
	public final static String NOLLA = "0.wav";
	public final static String YKSI = "1.wav";
	public final static String KAKSI = "2.wav";
	public final static String KOLME = "3.wav";
	public final static String NELJA = "4.wav";
	public final static String VIISI = "5.wav";
	public final static String KUUSI = "6.wav";
	public final static String SEITSEMAN = "7.wav";
	public final static String KAHDEKSAN = "8.wav";
	public final static String YHDEKSAN = "9.wav";
	public final static String SABERD = "Lightsaber_draw.wav";
	public final static String SABERSW = "Lightsaber_swing.wav";
	public final static String SABERWD = "Lightsaber_withdraw.wav";
	public final static String MARCH = "The Imperial March.wav";
	
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
		int test = Sound.playSample(soundFile, 100);
		LCD.clear();
		LCD.drawString(String.valueOf(test), 0, 0);
		Delay.msDelay(500);
	}

	/**
	 * Pysäyttää toistettavan audio tiedoston.
	 * 
	 */
	public void stopMusic() {
		Sound.pause(0);
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
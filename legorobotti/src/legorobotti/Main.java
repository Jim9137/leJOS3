package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

/**
 * Luokka jossa k‰ynnistet‰‰n ja kootaan yhteen kaikki toiminnallisuudet
 * jotka on luotu omissa luokissaan.
 * @author Vade
 * @version 1.0.0
 */

public class Main extends Thread {
	private EV3IRSensor  irsensori = new EV3IRSensor(SensorPort.S1);
	private Vemputin vemputin = new Vemputin();
	private Lyonti lyonti = new Lyonti();
	private Liike liike = new Liike();
	private AudioThread audio = new AudioThread();
	private Kosketus kosketus = new Kosketus();
	private Laskuri laskuri = new Laskuri();
/**
 * Javan metodi jota aletaan ajaa omassa thrediss‰ samaan
 * aikaan main metodin kanssa. Metodi k‰ynnistet‰‰n ensin
 * main metodissa. Metodi mahdollistaa robotin kauko-
 * ohjauksen kuuntelemalla IR-sensorilta saatuja arvoja.
 * Metodi myˆs piirt‰‰ LDC-n‰ytˆlle kuljetun matkan.
 * Metodi myˆs k‰ynnist‰‰ musiikin toiston Audio luokan 
 * metodilla audio.start, sek‰ aktivoi kosketus sensorin.
 */
	public void run() {
		Sound.setVolume(Sounds.VOL_MAX);
		audio.start();
		while (Button.ESCAPE.isUp()) {

			LCD.drawString("L0RD V4D3R", 0, 1);
			LCD.drawString("Matka: "+laskuri.returnTacho()/10, 0, 4); 
			// palauttaa saadut 10cm ja muuttaa ne metreiksi
			
			kosketus.touch();
			final int remoteCommand = irsensori.getRemoteCommand(2);
			switch (remoteCommand) {
			/**
			 * Robotti liikkuu suoraan eteenp‰in
			 */
			case 5:
				liike.eteen();
				Button.LEDPattern(1);
				break;
			/**
			 * Robotti liikkuu suoraan taaksep‰in
			 */
			case 8:
				liike.taakse();
				Button.LEDPattern(2);
				break;
			/**
			 * K‰‰ntyy liikkeest‰ oikealle
			 */
			case 3:
				liike.oikliike();
				Button.LEDPattern(4);
				break;
			/**
			 * K‰‰ntyy liikkeest‰ vasemmalle
			 */
			case 1:
				liike.vasliike();
				Button.LEDPattern(4);
				break; 
			/**
			 * K‰‰ntyy paikallaan vasemmalle
			 */
			case 10:
				liike.vaspaik();
				break;
			/**
			 * K‰‰ntyy paikallaan oikealle
			 */
			case 7:
				liike.oikpaik();
				break;
			/**
			 * K‰‰ntyy vasemmalle taakse
			 */
			case 6:
				liike.taaksevas();
				break;
			/**
			 * K‰‰ntyy oikealle taakse
			 */
			case 11:
				liike.taakseoik();
				break;
			/**
			 * K‰ynnist‰‰ vemputtimen
			 */
			case 2:
				vemputin.aloitajalopetavemputus();
				Button.LEDPattern(8);
				break;
			/**
			 * Suorittaa Lyˆntiliikkeen
			 */
			case 4:
				Button.LEDPattern(5);
				lyonti.alhaalla();
				break;
			/**
			 * Pys‰ytt‰‰ kaikki moottorit ja sammuttaa ledit.
			 */
			case 9:
				liike.seis();
				vemputin.lopetavemputus();
				Button.LEDPattern(0);

			}

		}
		// Pys‰yt‰ musiikki
		audio.stopMusic();
		// Sulje moottorit ja sensorit
		kosketus.close();
		liike.close();
		vemputin.close();
		lyonti.close();
		irsensori.close();
	}
	/**
	 * Main metodi joka k‰ynnist‰‰ run metodin. 
	 * Ohjelma jaktaa suorittamista kunnes run metodi
	 * on suoritettu loppuun joten se ei sulkeudu kun 
	 * main metodi on k‰yty loppuun.
	 */
	public static void main(String[] args) {
		Main checkerThread = new Main();
		checkerThread.start();
		
	}

}


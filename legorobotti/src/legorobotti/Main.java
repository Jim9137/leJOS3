package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.Sound;
import lejos.hardware.Sounds;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class Main extends Thread {
	private EV3IRSensor  irsensori = new EV3IRSensor(SensorPort.S1);
	private Vemputin vemputin = new Vemputin();
	//private Laskuri laskuri = new Laskuri();
	private Lyonti lyonti = new Lyonti();
	private Liike liike = new Liike();
	private AudioThread audio = new AudioThread();
	public Main() {
				
	}
	public void run() {
		Sound.setVolume(Sounds.VOL_MAX);
		audio.start();
		while (Button.ESCAPE.isUp()) {
			final int remoteCommand = irsensori.getRemoteCommand(2);
			switch (remoteCommand) {
			/*
			 * Robotti liikkuu suoraan eteenp‰in
			 */
			case 5:
				liike.eteen();
				Button.LEDPattern(1);
				break;
			/*
			 * Robotti liikkuu suoraan taaksep‰in
			 */
			case 8:
				liike.taakse();
				Button.LEDPattern(2);
				break;
			/*
			 * K‰‰ntyy liikkeest‰ oikealle
			 */
			case 3:
				liike.oikliike();
				Button.LEDPattern(4);
				break;
			/*
			 * K‰‰ntyy liikkeest‰ vasemmalle
			 */
			case 1:
				liike.vasliike();
				Button.LEDPattern(4);
				break; 
			/*
			 * K‰‰ntyy paikallaan vasemmalle
			 */
			case 10:
				liike.vaspaik();
				break;
			/*
			 * K‰‰ntyy paikallaan oikealle
			 */
			case 7:
				liike.oikpaik();
				break;
			/*
			 * K‰‰ntyy vasemmalle taakse
			 */
			case 6:
				liike.taaksevas();
				break;
			/*
			 * K‰‰ntyy oikealle taakse
			 */
			case 11:
				liike.taakseoik();
				break;
			/*
			 * K‰ynnist‰‰ vemputtimen
			 */
			case 2:
				vemputin.aloitajalopetavemputus();
				Button.LEDPattern(8);
//				audio.playMusic(Audio.SABERD);
				break;
			/*
			 * Suorittaa Lyˆntiliikkeen
			 */
			case 4:
				audio.stopSound();
				AudioThread.giveCommand(1);
				Button.LEDPattern(5);
				lyonti.alhaalla();
//				audio.playMusic(Audio.SABERSW);
				break;
			/*
			 * Pys‰ytt‰‰ kaikki moottorit ja sammuttaa ledit.
			 */
			case 9:
				liike.seis();
				vemputin.lopetavemputus();
				Button.LEDPattern(0);
//				audio.playMusic(Audio.MARCH);
				break;

			}

		}
		liike.close();
		vemputin.close();
		lyonti.close();
		irsensori.close();
	}

	public static void main(String[] args) {
		Main checkerThread = new Main();
		checkerThread.start();
		LCD.drawString("Lord VadeG", 0, 1);
		
	}

}


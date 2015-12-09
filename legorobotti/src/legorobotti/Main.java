package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

public class Main extends Thread {
	private EV3IRSensor  irsensori = new EV3IRSensor(SensorPort.S1);
	private Vemputin vemputin = new Vemputin();
	//private Laskuri laskuri = new Laskuri();
	private Lyonti lyonti = new Lyonti();
	private Liike liike = new Liike();
	
	public Main() {
				
	}
	public void run() {

		while (Button.ESCAPE.isUp()) {
			final int remoteCommand = irsensori.getRemoteCommand(2);
			switch (remoteCommand) {
			/*
			 * Robotti liikkuu suoraan eteenp�in
			 */
			case 5:
				liike.eteen();
				Button.LEDPattern(1);
				break;
			/*
			 * Robotti liikkuu suoraan taaksep�in
			 */
			case 8:
				liike.taakse();
				Button.LEDPattern(2);
				break;
			/*
			 * K��ntyy liikkeest� oikealle
			 */
			case 3:
				liike.oikliike();
				Button.LEDPattern(4);
				break;
			/*
			 * K��ntyy liikkeest� vasemmalle
			 */
			case 1:
				liike.vasliike();
				Button.LEDPattern(4);
				break; 
			/*
			 * K��ntyy paikallaan vasemmalle
			 */
			case 10:
				liike.vaspaik();
				break;
			/*
			 * K��ntyy paikallaan oikealle
			 */
			case 7:
				liike.oikpaik();
				break;
			/*
			 * K��ntyy vasemmalle taakse
			 */
			case 6:
				liike.taaksevas();
				break;
			/*
			 * K��ntyy oikealle taakse
			 */
			case 11:
				liike.taakseoik();
				break;
			/*
			 * K�ynnist�� vemputtimen
			 */
			case 2:
				vemputin.vemputalujaa();
				Button.LEDPattern(8);
				break;
			/*
			 * Suorittaa Ly�ntiliikkeen
			 */
			case 4:
				Button.LEDPattern(5);
				lyonti.alhaalla();
				break;
			/*
			 * Pys�ytt�� kaikki moottorit ja sammuttaa ledit.
			 */
			case 9:
				liike.seis();
				vemputin.lopetavemputus();
				Button.LEDPattern(0);
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


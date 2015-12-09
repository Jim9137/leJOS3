package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.ev3.LocalEV3;
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
			case 2:
				liike.eteen();
				break;
			case 4:
				liike.taakse();
				break;
			case 3:
				liike.taakseoik();
				break;
			case 1:
				liike.taaksevas();
				break;
			case 9:
				liike.seis();
				break;
			}
			final int remoteCommand2 = irsensori.getRemoteCommand(3);
			switch (remoteCommand2) {
			case 3:
				liike.oikpaik();
				break;
			case 1:
				liike.vaspaik();
				break;
			case 2:
				vemputin.vemputalujaa();
				break;
			case 4:
				lyonti.lyonti();
				break;
			case 9:
				liike.seis();
				lyonti.alhaalla();
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


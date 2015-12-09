package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.RegulatedMotor;

public class Main extends Thread {
	private EV3IRSensor  irsensori = new EV3IRSensor(SensorPort.S1);
	private Vemputin vemputin = new Vemputin();
	private Laskuri laskuri = new Laskuri();
	private Lyonti lyonti = new Lyonti();
	private Liike liike = new Liike();
	
	public Main() {
		//this.irsensori = IRsensori.getRemoteController();
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
				lyonti
				// m4.rotateTo(360);
				// m4.rotateTo(400);
				// m4.rotateTo(360);
				// m4.rotateTo(400);
				break;
			case 9:
				m1.flt(true);
				m2.flt(true);
				m3.flt(true);
				m4.stop();
				Button.LEDPattern(0);
				break;
			}

		}
		m1.close();
		m2.close();
		m3.close();
		m4.close();

	}

	public static void main(String[] args) {
		Main checkerThread = new Main();
		checkerThread.start();
		LCD.drawString("Lord VadeG", 0, 1);
	}

}


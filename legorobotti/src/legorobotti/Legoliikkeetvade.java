package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.robotics.RegulatedMotor;

public class Legoliikkeetvade extends RobotParts {
	private EV3IRSensor infraredSensor;

	public Legoliikkeetvade() {
		this.infraredSensor = super.getRemoteController();
	}

	public void run() {

		RegulatedMotor m1 = super.getLargeMotor1();
		m1.setSpeed(740);
		RegulatedMotor m2 = super.getLargeMotor2();
		m2.setSpeed(740);
		RegulatedMotor m3 = super.getDualBlades();
		RegulatedMotor m4 = super.getLightSaber();
		while (Button.ESCAPE.isUp()) {
			final int remoteCommand = infraredSensor.getRemoteCommand(2);
			switch (remoteCommand) {
			case 2:
				m1.setSpeed(740);
				m2.setSpeed(740);
				m1.forward();
				m2.forward();
				break;
			case 4:
				m1.setSpeed(600);
				m2.setSpeed(600);
				m1.backward();
				m2.backward();
				break;
			case 3:
				m1.forward();
				m1.setSpeed(360);
				m2.setSpeed(740);
				m2.forward();
				break;
			case 1:
				m2.setSpeed(360);
				m2.forward();
				m1.forward();
				m1.setSpeed(740);
				break;
			case 9:
				m1.flt(true);
				m2.flt(true);
				break;
			}
			final int remoteCommand2 = infraredSensor.getRemoteCommand(3);
			switch (remoteCommand2) {
			case 3:
				m1.setSpeed(740);
				m2.setSpeed(740);
				m1.forward();
				m2.backward();
				break;
			case 1:
				m1.setSpeed(740);
				m2.setSpeed(740);
				m1.backward();
				m2.forward();
				break;
			case 2:
				m3.setSpeed(740);
				m3.forward();
				Button.LEDPattern(8);
				break;
			case 4:
				Button.LEDPattern(5);
				m4.setSpeed(740);
				m4.rotateTo(90);
				m4.rotateTo(0);
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
		Legoliikkeetvade checkerThread = new Legoliikkeetvade();
		checkerThread.start();
		LCD.drawString("Lord VadeG", 0, 1);
	}

}


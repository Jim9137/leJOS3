package legorobotti;

import lejos.hardware.motor.Motor;

public class Liike {
	
	public void eteen() {
		Motor.A.forward();
		Motor.B.forward();
	}
	public void taakse() {
		Motor.A.backward();
		Motor.B.backward();
	}
	public void oikliike() {
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(740);
	}
	public void vasliike() {
		Motor.A.setSpeed(740);
		Motor.B.setSpeed(360);
	}
	public void oikpaik() {
		Motor.A.backward();
		Motor.B.forward();
	}
	public void vaspaik() {
		Motor.A.forward();
		Motor.B.backward();
	}
	public void taakseoik() {
		Motor.A.setSpeed(360);
		Motor.B.setSpeed(740);
		Motor.A.backward();
		Motor.B.backward();
	}
	
	public void taaksevas() {
		Motor.A.setSpeed(740);
		Motor.B.setSpeed(360);
		Motor.A.backward();
		Motor.B.backward();
	}
	public void seis() {
		Motor.A.stop(true);
		Motor.B.stop(true);
	}
}

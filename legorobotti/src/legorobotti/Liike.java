package legorobotti;

import lejos.hardware.motor.EV3LargeRegulatedMotor;

	/**
	 * Moottorien liikkeiden toiminnallisuus
	 * 
	 * @author pasi_lite
	 *
	 */

public class Liike implements Liikkeet {
	
	private static EV3LargeRegulatedMotor oikeaMoottori = RobotParts.getLargeMotor1();
	private static EV3LargeRegulatedMotor vasenMoottori = RobotParts.getLargeMotor2();
	
	
	public void eteen() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.forward();
		vasenMoottori.forward();
	}
	public void taakse() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.backward();
		vasenMoottori.backward();
	}
	public void oikliike() {
		oikeaMoottori.setSpeed(360);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.forward();
		vasenMoottori.forward();
	}
	public void vasliike() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(360);
		oikeaMoottori.forward();
		vasenMoottori.forward();
	}
	public void oikpaik() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.backward();
		vasenMoottori.forward();
	}
	public void vaspaik() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.forward();
		vasenMoottori.backward();
	}
	public void taakseoik() {
		oikeaMoottori.setSpeed(360);
		vasenMoottori.setSpeed(740);
		oikeaMoottori.backward();
		vasenMoottori.backward();
	}
	
	public void taaksevas() {
		oikeaMoottori.setSpeed(740);
		vasenMoottori.setSpeed(360);
		oikeaMoottori.backward();
		vasenMoottori.backward();
	}
	public void seis() {
		oikeaMoottori.stop(true);
		vasenMoottori.stop(true);
	}
	public void close() {
		RobotParts.closeDevice(RobotParts.getLargeMotor1());
		RobotParts.closeDevice(RobotParts.getLargeMotor2());
	}
}

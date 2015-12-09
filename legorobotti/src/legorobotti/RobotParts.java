package legorobotti;

import java.io.Closeable;
import java.io.IOException;

import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
//import lejos.hardware.sensor.EV3IRSensor;
import lejos.hardware.sensor.EV3TouchSensor;

public class RobotParts {
	final private static EV3LargeRegulatedMotor largeMotor1 = new EV3LargeRegulatedMotor(MotorPort.A);
	final private static EV3LargeRegulatedMotor largeMotor2 = new EV3LargeRegulatedMotor(MotorPort.B);
	
	final private static EV3LargeRegulatedMotor dualBlades = new EV3LargeRegulatedMotor(MotorPort.C); //eli vemputin
	
	final private static EV3MediumRegulatedMotor lightSaber = new EV3MediumRegulatedMotor(MotorPort.D);
	
	//final private static EV3IRSensor remoteController = new EV3IRSensor(SensorPort.S1);
	final private static EV3TouchSensor touchSensor = new EV3TouchSensor(SensorPort.S2);

	
	/**
	 * @return the largeMotor1
	 */
	protected synchronized static EV3LargeRegulatedMotor getLargeMotor1() {
		return largeMotor1;
	}
	
	/**
	 * @return the largeMotor2
	 */
	protected synchronized static EV3LargeRegulatedMotor getLargeMotor2() {
		return largeMotor2;
	}
	/**
	 * @return the dualBlades
	 */
	protected synchronized static EV3LargeRegulatedMotor getDualBlades() {
		return dualBlades;
	}
	/**
	 * @return the lightSaber
	 */
	protected synchronized static EV3MediumRegulatedMotor getLightSaber() {
		return lightSaber;
	}
//	/**
//	 * @return the remoteController
//	 */
//	protected synchronized static EV3IRSensor getRemoteController() {
//		return remoteController;
//	}
	/**
	 * @return the touchSensor
	 */
	protected synchronized static EV3TouchSensor getTouchSensor() {
		return touchSensor;
	}

	/**
	 * Close selected device
	 * @param device - the device to close
	 * @throws IOException - if some sort of IO error occurs
	 */
	protected synchronized static void closeDevice(Closeable device) {
		try {
			device.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

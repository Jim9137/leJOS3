package legorobotti;

import lejos.hardware.Button;
import lejos.hardware.lcd.LCD;
import lejos.hardware.motor.EV3LargeRegulatedMotor;
import lejos.hardware.motor.EV3MediumRegulatedMotor;
import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;
import lejos.hardware.sensor.EV3TouchSensor;
import lejos.utility.Delay;

public class Main {
	final private EV3LargeRegulatedMotor largeMotor1 = new EV3LargeRegulatedMotor(MotorPort.A);
	final private EV3LargeRegulatedMotor largeMotor2 = new EV3LargeRegulatedMotor(MotorPort.B);
	final private EV3LargeRegulatedMotor dualBlades = new EV3LargeRegulatedMotor(MotorPort.C); //eli vemputin
	
	final private EV3MediumRegulatedMotor lightSaber = new EV3MediumRegulatedMotor(MotorPort.D);
	
	final private EV3IRSensor remoteController = new EV3IRSensor(SensorPort.S1);
	final private EV3TouchSensor touchSensor = new EV3TouchSensor(SensorPort.S2);
	
	public static void main(String[] args) {
		// eri luokat pit‰isi antaa yll‰olevat muuttujat konstruktoriin ja k‰ynnist‰‰ t‰ss‰
		
		LCD.drawString("VADER",0,0);
		
	}

}

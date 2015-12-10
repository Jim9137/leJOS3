package legorobotti;

import lejos.hardware.port.SensorPort;
import lejos.hardware.sensor.EV3IRSensor;

/**
 * 
 * @author Vade
 *
 */
public class IRsensori {
	private EV3IRSensor  sensoriir = new EV3IRSensor(SensorPort.S1);
	
	public void kaukana() {
		sensoriir.getDistanceMode();
		
	}

}

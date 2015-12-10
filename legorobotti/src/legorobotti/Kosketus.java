package legorobotti;
import lejos.hardware.*;
import lejos.utility.Delay;

/**
 * T‰ss‰ classissa m‰‰ritell‰‰n mit‰ kosketussensorin metodi
 * Pyst‰ytt‰‰ moottorit, kun kosketussensori on painettu pohjaan
 * @author Henri
 *
 */


public class Kosketus {
	private Liike liike = new Liike();
	
	float[] sample = new float[RobotParts.getTouchSensor().sampleSize()];
	
	
	public void touch() {
		
		RobotParts.getTouchSensor().fetchSample(sample, 0);
		
		if (sample[0] == 1) {
			liike.taakse();
			Delay.msDelay(300);
			liike.seis();
		} 
	}
}


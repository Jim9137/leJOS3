package legorobotti;
import lejos.hardware.*;

/**
 * T‰ss‰ classissa m‰‰ritell‰‰n mit‰ kosketussensorin metodi
 * Pyst‰ytt‰‰ moottorit, kun kosketussensori on painettu pohjaan
 * @author Henri
 *
 */


public class Kosketus {
	
	
	float[] sample = new float[RobotParts.getTouchSensor().sampleSize()];
	
	
	public void touch() {
		
		RobotParts.getTouchSensor().fetchSample(sample, 0);
		
		if (RobotParts.getTouchSensor().sampleSize() == 1) {
			RobotParts.getLargeMotor1().rotate(-350);
			RobotParts.getLargeMotor2().rotate(-350);
			RobotParts.getLargeMotor1().stop();
			RobotParts.getLargeMotor2().stop();
		} else {
			
		}
	}
}


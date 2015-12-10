package legorobotti;
import lejos.hardware.*;




public class Kosketus {
	
	
	float[] sample = new float[RobotParts.getTouchSensor().sampleSize()];
	
	
	public void touch() {
		
		if (RobotParts.getTouchSensor().sampleSize() == 1) {
			RobotParts.getLargeMotor1().stop();
			RobotParts.getLargeMotor2().stop();
		} else {
			
		}
	}
}


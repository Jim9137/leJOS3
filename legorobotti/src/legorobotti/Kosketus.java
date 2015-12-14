package legorobotti;
import lejos.hardware.*;
import lejos.utility.Delay;

/**
 * T‰ss‰ classissa m‰‰ritell‰‰n kosketussensorin metodi
 * Kun kosketussensori on painettu pohjaan, laite peruuttaa hieman
 * jonka j‰lkeen pys‰htyy ja on j‰lleen valmiina toimimaan
 * @author Henri
 *
 */


public class Kosketus {
	
	private Liike liike = new Liike();
	
	float[] sample = new float[RobotParts.getTouchSensor().sampleSize()];
	
	/**
	 * touch metodi, kun sample on 1, robotti liikkuu taaksep‰in 300ms
	 * jonka j‰lkeen pys‰htyy ja on valmis jatkamaan
	 */
	
	public void touch() {
		
		RobotParts.getTouchSensor().fetchSample(sample, 0);
		
		if (sample[0] == 1) {
			liike.taakse();
			Delay.msDelay(300);
			liike.seis();
		} 
	}
	
	public void close() {
		RobotParts.getTouchSensor().close();
	}
}


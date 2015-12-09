package legorobotti;

/**
 * Tämän classin tarkoitus on toteuttaa lyöntiliike
 * lyöntiliike käyttää medium regulated moottoria, moottoriportissa D.
 * @author Henri
 * 
 * 
 */

public class Lyonti implements Liikkeet {

	/**
	 * Normaali lyönti, joka kiertää moottoria 90 astetta ja palaa 90 astetta takaisinpäin
	 */
	
	public void lyonti() {
		
		RobotParts.getLightSaber().rotateTo(90);
		RobotParts.getLightSaber().rotateTo(0);
	}
	
	/**
	 * Lyöntiliike, joka jää alas 90 asteeseen ja uudelleen kutsuttaessa nousee ylös 90 astetta
	 */
	
	public void alhaalla() {
		
		if (RobotParts.getLightSaber().getLimitAngle() == 0) {
			
			RobotParts.getLightSaber().rotateTo(90);
			
		} else {
			
			RobotParts.getLightSaber().rotateTo(0);
		}

	}
	
	public void close() {
		RobotParts.closeDevice(RobotParts.getLightSaber());
	}
	
}

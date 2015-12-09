package legorobotti;

/**
 * T�m�n classin tarkoitus on toteuttaa ly�ntiliike
 * ly�ntiliike k�ytt�� medium regulated moottoria, moottoriportissa D.
 * @author Henri
 * 
 * 
 */

public class Lyonti implements Liikkeet {

	/**
	 * Normaali ly�nti, joka kiert�� moottoria 90 astetta ja palaa 90 astetta takaisinp�in
	 */
	
	public void lyonti() {
		
		RobotParts.getLightSaber().rotateTo(90);
		RobotParts.getLightSaber().rotateTo(0);
	}
	
	/**
	 * Ly�ntiliike, joka j�� alas 90 asteeseen ja uudelleen kutsuttaessa nousee yl�s 90 astetta
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

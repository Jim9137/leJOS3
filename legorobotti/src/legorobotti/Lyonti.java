package legorobotti;
import lejos.hardware.*;

/**
 * T�m�n classin tarkoitus on toteuttaa ly�ntiliike
 * ly�ntiliike k�ytt�� medium regulated moottoria, moottoriportissa D.
 * @author Henri
 * 
 * 
 */

public class Lyonti extends RobotParts {

	private int kasky;
		
	/**
	 * Normaali ly�nti, joka kiert�� moottoria 90 astetta ja palaa 90 astetta takaisinp�in
	 */
	
	public void lyonti() {
		
		super.getLightSaber().rotateTo(90);
		super.getLightSaber().rotateTo(0);
	}
	
	/**
	 * Ly�ntiliike, joka j�� alas 90 asteeseen ja uudelleen kutsuttaessa nousee yl�s 90 astetta
	 */
	
	public void alhaalla() {
		
		if (super.getLightSaber().getLimitAngle() == 0) {
			
			super.getLightSaber().rotateTo(90);
			
		} else {
			
			super.getLightSaber().rotateTo(0);
		}

	}
	
}

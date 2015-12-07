package legorobotti;
import lejos.hardware.*;

/**
 * Tämän classin tarkoitus on toteuttaa lyöntiliike
 * lyöntiliike käyttää medium regulated moottoria, moottoriportissa D.
 * @author Henri
 * 
 * 
 */

public class Lyonti extends RobotParts {

	private int kasky;
		
	/**
	 * Normaali lyönti, joka kiertää moottoria 90 astetta ja palaa 90 astetta takaisinpäin
	 */
	
	public void lyonti() {
		
		super.getLightSaber().rotateTo(90);
		super.getLightSaber().rotateTo(0);
	}
	
	/**
	 * Lyöntiliike, joka jää alas 90 asteeseen ja uudelleen kutsuttaessa nousee ylös 90 astetta
	 */
	
	public void alhaalla() {
		
		if (super.getLightSaber().getLimitAngle() == 0) {
			
			super.getLightSaber().rotateTo(90);
			
		} else {
			
			super.getLightSaber().rotateTo(0);
		}

	}
	
}

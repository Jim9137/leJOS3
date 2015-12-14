package legorobotti;

/**
 * Luokka laskee nopeuden, kiihtyvyyden ja kierroksien lukum��r�n. 
 * Yksik�t ovat asteissa.
 * @author Jim
 *
 */


public class Laskuri {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinn� (asteita per sekunti)
	 * @return int nopeus
	 */
	
	public int returnVelocity() {
		return RobotParts.getLargeMotor1().getSpeed();
		}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden aste per sekuntia toiseen
	 * @return int kiihtyvyys
	 */
	
	public int returnAcceleration() {
		return RobotParts.getLargeMotor1().getAcceleration();
	}
	
	/**
	 * Palauttaa moottoreiden kierrosten lukum��r�n
	 * @return int kierrokset (asteet/360).
	 */
	public float returnTacho() {
		return RobotParts.getLargeMotor1().getTachoCount()/360;
	}
	


}

package legorobotti;

/**
 * Luokka laskee nopeuden, kiihtyvyyden ja kierroksien lukumäärän. 
 * Yksiköt ovat asteissa.
 * @author Jim
 *
 */


public class Laskuri {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinnä (asteita per sekunti)
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
	 * Palauttaa moottoreiden kierrosten lukumäärän
	 * @return int kierrokset (asteet/360).
	 */
	public float returnTacho() {
		return RobotParts.getLargeMotor1().getTachoCount()/360;
	}
	


}

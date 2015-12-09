package legorobotti;

/**
 * Luokka laskee tiettyj� ominaisuuksia M��RITTELE
 * Sanoo auki jokainen wav. 0-9, mahdollisesti yksikk�� (ajattele junan kuuluttaja)
 * Laskee vaikka 10 sekunnin v�lein ja ilmoittaa oman el�m�ns�l
 * Jos sensoreita irtoaa tarkistaa nopeuden ja toteaa tilansa
 * ilmoittaa jos sensori ei ole kiinni
 * Analogiset jos irtoaa ABCD
 * Sensorit jos irtoaa 1234
 * @author Jim
 *
 */

/** 
 * Ratkaise mit� tietoa ja metriikkaa saadaan moottoreista
 * Ja IR sensorista
 * @author Jim
 *
 */


/**
 * Pit�� saada p��sy kaikkiin moottoreihin ja IR sensoriin mahdollisesti
 * Konstruktori ottaa argumentteina x m��r�n moottoreita?
 * Vai onko ne jotain sis�isi� muuttuja joihin voi sijoittaa moottori-oliot? 
 * 
 * @author Jim
 *
 */

public class Laskuri {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinn� (asteita per sekunti)
	 * @return largeMotor1.getSpeed()+largeMotor2.getSpeed()/2
	 */
	
	public int returnVelocity() {
		return (RobotParts.getLargeMotor1().getSpeed()+RobotParts.getLargeMotor2().getSpeed())/2;	
		}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metri� per sekuntia toiseen
	 * @return (RobotParts.getLargeMotor1().getAcceleration()+RobotParts.getAcceleration().getSpeed())/2;	
	 */
	
	public int returnAcceleration() {
		return (RobotParts.getLargeMotor1().getAcceleration()+RobotParts.getLargeMotor2().getAcceleration())/2;	
	}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metri� per sekuntia toiseen
	 * @return (RobotParts.getLargeMotor1().getTachoCount()+RobotParts.getLargeMotor2().getTachoCount())/2;
	 */
	public int returnTacho() {
		return (RobotParts.getLargeMotor1().getTachoCount()+RobotParts.getLargeMotor2().getTachoCount())/2;
	}
	


}

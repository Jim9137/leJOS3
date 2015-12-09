package legorobotti;

/**
 * Luokka laskee tiettyjä ominaisuuksia MÄÄRITTELE
 * Sanoo auki jokainen wav. 0-9, mahdollisesti yksikköä (ajattele junan kuuluttaja)
 * Laskee vaikka 10 sekunnin välein ja ilmoittaa oman elämänsäl
 * Jos sensoreita irtoaa tarkistaa nopeuden ja toteaa tilansa
 * ilmoittaa jos sensori ei ole kiinni
 * Analogiset jos irtoaa ABCD
 * Sensorit jos irtoaa 1234
 * @author Jim
 *
 */

/** 
 * Ratkaise mitä tietoa ja metriikkaa saadaan moottoreista
 * Ja IR sensorista
 * @author Jim
 *
 */


/**
 * Pitää saada pääsy kaikkiin moottoreihin ja IR sensoriin mahdollisesti
 * Konstruktori ottaa argumentteina x määrän moottoreita?
 * Vai onko ne jotain sisäisiä muuttuja joihin voi sijoittaa moottori-oliot? 
 * 
 * @author Jim
 *
 */

public class Laskuri {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinnä (asteita per sekunti)
	 * @return largeMotor1.getSpeed()+largeMotor2.getSpeed()/2
	 */
	
	public int returnVelocity() {
		return (RobotParts.getLargeMotor1().getSpeed()+RobotParts.getLargeMotor2().getSpeed())/2;	
		}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metriä per sekuntia toiseen
	 * @return (RobotParts.getLargeMotor1().getAcceleration()+RobotParts.getAcceleration().getSpeed())/2;	
	 */
	
	public int returnAcceleration() {
		return (RobotParts.getLargeMotor1().getAcceleration()+RobotParts.getLargeMotor2().getAcceleration())/2;	
	}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metriä per sekuntia toiseen
	 * @return (RobotParts.getLargeMotor1().getTachoCount()+RobotParts.getLargeMotor2().getTachoCount())/2;
	 */
	public int returnTacho() {
		return (RobotParts.getLargeMotor1().getTachoCount()+RobotParts.getLargeMotor2().getTachoCount())/2;
	}
	


}

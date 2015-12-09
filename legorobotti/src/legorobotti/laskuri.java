package legorobotti;

import lejos.hardware.ev3.LocalEV3;

/**
 * Luokka laskee tiettyjä ominaisuuksia MÄÄRITTELE
 * Sanoo auki jokainen wav. 0-9, mahdollisesti yksikköä (ajattele junan kuuluttaja)
 * Laskee vaikka 10 sekunnin välein ja ilmoittaa oman elämänsä
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

public class laskuri extends RobotParts {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinnä (asteita per sekunti)
	 * @return largeMotor1.getSpeed()+largeMotor2.getSpeed()/2
	 */
	
	public int returnVelocity() {
		return (super.getLargeMotor1().getSpeed()+super.getLargeMotor2().getSpeed())/2;	
		}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metriä per sekuntia toiseen
	 * @return (super.getLargeMotor1().getAcceleration()+super.getAcceleration().getSpeed())/2;	
	 */
	
	public int returnAcceleration() {
		return (super.getLargeMotor1().getAcceleration()+super.getLargeMotor2().getAcceleration())/2;	
	}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metriä per sekuntia toiseen
	 * @return (super.getLargeMotor1().getTachoCount()+super.getLargeMotor2().getTachoCount())/2;
	 */
	public int returnTacho() {
		return (super.getLargeMotor1().getTachoCount()+super.getLargeMotor2().getTachoCount())/2;
	}

}

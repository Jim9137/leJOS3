package legorobotti;

import lejos.hardware.ev3.LocalEV3;

/**
 * Luokka laskee tiettyj� ominaisuuksia M��RITTELE
 * Sanoo auki jokainen wav. 0-9, mahdollisesti yksikk�� (ajattele junan kuuluttaja)
 * Laskee vaikka 10 sekunnin v�lein ja ilmoittaa oman el�m�ns�
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

public class laskuri extends RobotParts {
	
	/**
	 *  Palauttaa telaketjujen nopeuden keskiarvon intinn� (asteita per sekunti)
	 * @return largeMotor1.getSpeed()+largeMotor2.getSpeed()/2
	 */
	
	public int returnVelocity() {
		return (super.getLargeMotor1().getSpeed()+super.getLargeMotor2().getSpeed())/2;	
		}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metri� per sekuntia toiseen
	 * @return (super.getLargeMotor1().getAcceleration()+super.getAcceleration().getSpeed())/2;	
	 */
	
	public int returnAcceleration() {
		return (super.getLargeMotor1().getAcceleration()+super.getLargeMotor2().getAcceleration())/2;	
	}
	
	/**
	 * Palauttaa moottoreiden kiihtyvyyden keskiarvon metri� per sekuntia toiseen
	 * @return (super.getLargeMotor1().getTachoCount()+super.getLargeMotor2().getTachoCount())/2;
	 */
	public int returnTacho() {
		return (super.getLargeMotor1().getTachoCount()+super.getLargeMotor2().getTachoCount())/2;
	}

}

package legorobotti;

/** Luokka luo metodit vemputtimelle
 *  Luokka hakee moottorit RobotParts luokasta joten niitä ei tarvitse luoda erikseen.
 * 
 * @author Vade
 *
 */
public class Vemputin implements Liikkeet {
	/*
	 *Metodi aloittaa vemputuksen maksimi nopeudella
	 */
	public void vemputalujaa() {
		RobotParts.getDualBlades().setSpeed(740);
		RobotParts.getDualBlades().forward();
	}
	/*
	 * Metodi aloittaa vemputuksen hiljaisella nopeudella
	 */
	public void vemputavahasen() {
		RobotParts.getDualBlades().setSpeed(360);
		RobotParts.getDualBlades().forward();
	}
	/*
	 * Metodi lopettaa vemputuksen.
	 */
	public void lopetavemputus() {
		RobotParts.getDualBlades().setSpeed(0);
		RobotParts.getDualBlades().stop(true);
	}
	/*
	 * Metodi aloittaa vemputuksen tietyllä nopeudella.
	 */
	public void vemputa(int nopeus) {
		RobotParts.getDualBlades().setSpeed(nopeus);
		RobotParts.getDualBlades().forward();
	}
	
	/**
	 * Metodi aloittaa ja lopettaa vemputuksen
	 * Pyörittää moottoria eteenpäin, kunnes metodia kutsutaan uudelleen jolloin moottori pysäytetään
	 * @author Henri
	 */
	
	public void aloitajalopetavemputus() {
		if (RobotParts.getDualBlades().getSpeed() == 0) {
			vemputalujaa();
		} else {
			lopetavemputus();
		}
	}
	/**
	 * sulkee moottorin
	 * @author Henri
	 */
	
	public void close() {
		RobotParts.closeDevice(RobotParts.getDualBlades());
	}
}

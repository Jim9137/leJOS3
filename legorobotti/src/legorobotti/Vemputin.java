package legorobotti;

/** Luokka luo metodit vemputtimelle
 *Luokka perii moottori RobotParts luokasta joten niitä ei tarvitse luoda erikseen.
 * 
 * @author Vade
 *
 */
public class Vemputin extends RobotParts{
	
	/*
	 *Metodi aloittaa vemputuksen maksimi nopeudella
	 */
	public void vemputalujaa() {
		super.getDualBlades().setSpeed(740);
		super.getDualBlades().forward();
	}
	/*
	 * Metodi aloittaa vemputuksen hiljaisella nopeudella
	 */
	public void vemputavahasen() {
		super.getDualBlades().setSpeed(360);
		super.getDualBlades().forward();
	}
	/*
	 * Metodi lopettaa vemputuksen.
	 */
	public void lopetavemputus() {
		super.getDualBlades().stop(true);
	}
	/*
	 * Metodi aloittaa vemputuksen tietyllä nopeudella.
	 */
	public void vemputa(int nopeus) {
		super.getDualBlades().setSpeed(nopeus);
		super.getDualBlades().forward();
	}
}

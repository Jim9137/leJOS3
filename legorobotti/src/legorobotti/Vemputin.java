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
	}
	/*
	 * Metodi lopettaa vemputuksen
	 */
	public void lopetavemputus() {
		super.getDualBlades().stop(true);
	}
}

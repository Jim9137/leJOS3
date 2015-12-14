package legorobotti;


/**
 * Tämä rajapinta määrittelee moottoreille käytössä olevat funktiot
 * @author Jim
 *
 */
public interface Liikkeet {
	/**
	 * Tämä on pakollinen funktio kaikille moottoreille, koska ne pitää pystyä sulkemaan
	 */
	public void close();
}

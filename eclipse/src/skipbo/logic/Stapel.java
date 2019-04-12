package skipbo.logic;

import java.util.Stack; //stapel
import java.util.Collections; // zum Mischen
import java.util.EmptyStackException;
import java.util.Collection;

/* 
 * @author r_conforti
 */

public abstract class Stapel {

	protected Stack<Karte> karten = new Stack<Karte>();

	/*
	 * Anzahl der Karten auf dem Stapel
	 * 
	 * @return Gibt Anzahl der Karten auf dem Stapel aus
	 */

	public int anzahlKarten() {
		return this.karten.size();
	}

	/*
	 * Zeigt oberste Karte des Stapels, ohne sie zu entfernen
	 * 
	 * @return oberste Karte des Stapels
	 * 
	 * @throws StapelLeerException
	 */
	public Karte obersteKarteAnschauen() throws StapelLeerException {
		try {
			return karten.peek();
		} catch (EmptyStackException e) {
			throw new StapelLeerException();
		}
	}

	/*
	 * Entfernet oberste Karte des Stapels
	 * 
	 * @return Referenz auf oberste Karte
	 * 
	 * @throws StapelLeerException
	 */
	public Karte entferneObersteKarte() throws StapelLeerException {
		try {
			return karten.pop();
		} catch (EmptyStackException e) {
			throw new StapelLeerException();
		}
	}
}

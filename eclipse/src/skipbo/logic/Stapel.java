package skipbo.logic;
import java.util.Stack; //Stapelklasse aus API
import skipbo.exceptions.StapelLeerException;
import java.util.EmptyStackException;

 /* Die Klasse Stapel simuliert einen Kartenstapel im SkipBo-Spiel.
  *  Die Klasse ist abstract, da nur konkrete Stapel-Nachfahren genutzt werden sollen.
  *  Daher können keine Karten auf den abstrakten Stapel gelegt werden,
  *  das Herunternehmen und Anschauen der obersten Karte sowie die Abfrage 
  *  der aktuellen Groesse soll aber in allen erbenden Klassen verfügbar sein.  
 * 
 * @author r_conforti
 * @author die
 */

public abstract class Stapel {

	private Stack<Karte> karten = new Stack<Karte>();

	
	/** Anzahl der Karten auf dem Stapel
	 * @return Anz. Karten auf Stapel
	 */
	public int getGroesse(){
		return this.karten.size();
	
	}
	
	/** liefert die Referenz auf die oberste Karte des Stapels, ohne 
	 *  sie zu entfernen.
	 * @return oberste Karte des Stapels
	 * @throws StapelLeerException
	 */
	public Karte obersteKarteAnschauen() throws StapelLeerException
	{
		try {
			return karten.peek();
			// Stack wirft evtl. EmptyStackException ...
		} catch(EmptyStackException e)
		{
			// ... die wir durch eine StapelLeerExceptions ersetzen.
			throw new StapelLeerException();
		}
	}
	
	/** liefert eine Referenz auf die oberste Karte und
	 * entfernt sie vom Stapel
	 * @return Referenz auf oberste Karte
	 * @throws StapelLeerException
	 */
	public Karte entferneObersteKarte() throws StapelLeerException
	{
		try {
			return karten.pop();
		} catch(EmptyStackException e)
		{
			throw new StapelLeerException();
		}
	}
}


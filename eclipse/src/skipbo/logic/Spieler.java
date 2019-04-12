package skipbo.logic;
import java.util.ArrayList;

/*
 * @author b.kalki
 */

/*
 * Klasse Spieler ist eine Klasse die das Objekt des spielers bildet
 */
public class Spieler {
	//Attribute der Klasse Spieler
	
	private String name = "";
	private int alter;
	private int posInRunde;
	//private Hand Hand; 
	//private Spielerstapel sstpl  = new Spielerstapel;
	//private ArrayList<Hilfsstabel> hilfsstapel = new ArrayList<>();
	
	/*
	 * Konstruktor der Klasse Spieler, verlangt namen, alter und posInRunde
	 */
	public Spieler(String name, int alter, int posInRunde) {
		this.name = name;
		this.alter = alter;
		this.posInRunde = posInRunde;
	}
	// Methoden der Klasse Spieler
	
	/*
	 * setter für Namen des Spielers
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * get-Methode für Namen des Spielers
	 * @returns spieler.name
	 */
	public String getName() {
		return this.name;
	}
	
	/*
	 * setter für Alter des Spielers
	 */
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	/*
	 * get-Methode für Alter des Spielers
	 * @returns spieler.alter
	 */
	public int getAlter() {
		return this.alter;
	}
	
	/*
	 * setter für die Position des Spieler in der Runde
	 */
	public void setPosInRunde(int posInRunde) {
		this.posInRunde = posInRunde;
	}
	
	/*
	 * get-Methode für Position des Spieler in der Runde
	 * @returns spieler.posInRunde
	 */
	public int getPosInRunde() {
		return this.posInRunde;
	}
	
	/*
	 * Spieler Informationen aus allen Attributen
	 * @returns alle Attribute des Spieler als String in Reihenfolge name, alter, posInRunde
	 */
	public String getSpielerInfo(){
		return "Name: "+ this.name + "\nAlter: " + this.alter + "\nPosition in Runde: " + this.posInRunde;
	}
	
	/*
	 *Main Methode als Test für Konstruktor (bei benutzung entnehmen!) 
	 */
	public static void main(String[] args){
	    Spieler s1 = new Spieler("BK", 12, 1);
	    System.out.println(s1.getSpielerInfo());
	  }
}

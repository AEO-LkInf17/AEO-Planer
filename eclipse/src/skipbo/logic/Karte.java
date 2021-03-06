package skipbo.logic;
import java.util.Scanner; 
/*
 * 
 * @author e_berardi
 * @author r_conforti
 * 
 * Die Klasse "Karte" bildet das Objekt "Karte" 
 */


public class Karte 
{

	// Attribute der Klasse Spieler 

	private int zahl;
	private boolean Skipbo;
	private int gewuenschterWert;
	private Scanner obj;
	
	/*
	 * 
	 * Jeder Karte wird eine Zahl zugewiesen
	 */
	
	// public static final int SKIPBO=0, EINS=1, ZWEI=2, DREI=3, VIER=4, F�NF=5, SECHS=6, SIEBEN=7, ACHT=8, NEUN=9, ZEHN=10, ELF=11, ZW�LF=12;

	/*
	 * Konstruktor der Klasse Karte, verlangt zahl und Skipbo
	 */
	public Karte (int zahl, boolean Skipbo) {
		this.zahl= zahl;
		this.Skipbo= Skipbo;
		
	}
	
	/*
	 *get-Methode f�r den Wert (zahl) von die Karte 
	 *@return zahl  
	 */
	public int getZahl ()
	{
		return zahl;
	}
	
	/*
	 * get-Methode f�r den Gew�nschter Wert der Karte
	 * @return gewueschterWert
	 */
	public int getGewuenschterWert() 
	{
		return this.gewuenschterWert;
	}
	
	/*
	 * get-Methode ob Skipbo true or false ist
	 * @return Skipbo
	 */
 
	public boolean getSkipbo() 
	{
		return Skipbo;
	}
	
	/*
	 * Set-Methode f�r zahl 
	 */
	
	public void setZahl(int z) {
		this.zahl = z;
	}
	
	/*
	 * Set-Methode f�r Gew�nschter Wert 
	 */
	public void setGewuenschterWert(int gw) {
		this.gewuenschterWert = gw;
	}
	
	/*
	 * Set-Methode f�r die Skipbo Karte 
	 */
	public void setSkipbo(boolean s) {
		this.Skipbo = s;
	}
	
	/*
	 * toString Methode: wenn Skipbo true ist dann muss der Spieler eine Zahl wehlen  
	 */
	
public String toString() {
	  if(Skipbo == true) {
		   obj = new Scanner(System.in);
		   System.out.print("W�hle eine beliebige Zahl:");
		   
		   int neueZahl = obj.nextInt();
		   setZahl(neueZahl);   
	}   
	return this.zahl + " " + " ";
}	 
	
	 public static void main(String[] args) {
		 Karte k = new Karte(0,true);
		 System.out.println("Karte: " + k.toString());
	 }
}

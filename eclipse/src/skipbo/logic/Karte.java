package skipbo.logic;
import java.util.Scanner; 
/*
 * @author e_berardi
 * @author r_conforti
 */


public class Karte 
{

	

	private int zahl;
	private boolean Skipbo;
	private int gewuenschterWert;
	
	/*
	 * 
	 * Jeder Karte wird eine Zahl zugewiesen
	 */
	
	// public static final int SKIPBO=0, EINS=1, ZWEI=2, DREI=3, VIER=4, FÜNF=5, SECHS=6, SIEBEN=7, ACHT=8, NEUN=9, ZEHN=10, ELF=11, ZWÖLF=12;

	public Karte (int zahl, boolean Skipbo) {
		this.zahl= zahl;
		this.Skipbo= Skipbo;
		
	}
	

	public int getZahl ()
	{
		return zahl;
	}
	
	public int getGewuenschterWert() 
	{
		return this.gewuenschterWert;
	}
	
	
 
	public boolean getSkipbo() 
	{
		return Skipbo;
	}
	
	public void setZahl(int z) {
		this.zahl = z;
	}
	
	public void setGewuenschterWert(int gw) {
		this.gewuenschterWert = gw;
	}
	
	public void setSkipbo(boolean s) {
		this.Skipbo = s;
	}
	
public String toString() {
	  if(Skipbo == true) {
		   Scanner s = new Scanner(System.in);
		   System.out.print("Wähle eine beliebige Zahl:");
		   
		   int neueZahl = s.nextInt();
		   setZahl(neueZahl);   
	}   
	return this.zahl + " ";
}	 
	
	 public static void main(String[] args) {
		 Karte k = new Karte(0,true);
		 System.out.println(k.toString());
	 }
}

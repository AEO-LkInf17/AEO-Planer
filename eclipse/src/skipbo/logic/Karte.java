package skipbo.logic;


public class Karte {
	
	private int zahl;
	private boolean Skipbo;
	private int gewuenschterWert;

	public Karte (int zahl, boolean Skibo, int gewuenschterWert) {
		this.zahl= zahl;
		this.Skipbo= Skipbo;
		this.gewuenschterWert= gewuenschterWert;
	}
	public int getZahl () {
		return zahl;
	}
	
	public int getGewuenschterWert() {
		return this.gewuenschterWert;
	}
	
	public void setGewuenschterWert(int gewuenschterWert) {
		this.gewuenschterWert = gewuenschterWert;
	}
 
	public boolean istSkipbo() {
		return Skipbo;
	}
	
	public String toString() {
	if (this.Skipbo) {
		this.zahl = +1;
	}
	return null;
	}
}
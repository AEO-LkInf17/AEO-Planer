package skipbo.logic;

public class Ablagestapel extends Stapel {
   
	private int maxKarten;
	private int anzahlStapel;

public Ablagestapel(int maxKarten, int anzahStapel) {
	this.maxKarten = maxKarten;
	this.anzahlStapel = anzahlStapel;
}
public void setMaxKarten(int nMaxKarten) {
	this.maxKarten = nMaxKarten;
}

public void setAnzahlStapel(int nAnzahlStapel) {
	this.anzahlStapel = nAnzahlStapel;
}
public static void main(String[] args) {
Ablagestapel as = new Ablagestapel(12,4);
as.setMaxKarten(8);
}
}

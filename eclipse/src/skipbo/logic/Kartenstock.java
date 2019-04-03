package skipbo.logic;
import java.util.Stack;
import java.util.Collections; 
import java.util.Collection;

/*
 * @author r_conforti
 */

public class Kartenstock extends Stapel{


public Karte gibErsteKarte() {
	return karten.peek();
}

public void mischeKartenstock(){
	Collections.shuffle(karten);
}

public void kartenAnzeigen() {
	for(Karte k: this.karten) { //F�r jede Karte k aus karten wird die folgende Anweisung erf�llt
		System.out.println(k);
	}
}

public void bef�llen() {
	for(int i=0; i<4; i++) {
	this.karten.add(new Karte(3, false));
}
	for(int i=0; i<4; i++) {
		this.karten.add(new Karte(5, false));
	}
}

public static void main(String[] args) {
	Kartenstock ks = new Kartenstock();
	ks.bef�llen();
	ks.mischeKartenstock();
	System.out.println(ks.anzahlKarten());

	
}
}

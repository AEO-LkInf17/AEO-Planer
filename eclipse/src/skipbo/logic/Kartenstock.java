package skipbo.logic;

import java.util.Collections; // zum Mischen


/*
 * @author r_conforti
 */

public class Kartenstock extends Stapel {

	/*
	 * Kartenstock wird gemischt
	 */
	public void mischeKartenstock() {
		Collections.shuffle(karten);
	}

	/*
	 * Jeder Kartenwert aus dem Kartenstock wird durch s.o.p ausgegeben
	 */
	public void kartenAnzeigen() {
		for (Karte k : this.karten) { // F�r jede Karte k aus karten wird die folgende Anweisung erf�llt
			System.out.println(k);
		}
	}

	/*
	 * Alle Karten werden erzeugt
	 */
	public void bef�llen() {
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(1, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(2, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(3, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(4, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(5, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(6, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(7, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(8, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(9, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(10, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(11, false));
		}
		for (int i = 0; i < 12; i++) {
			this.karten.add(new Karte(12, false));
		}
		for (int i = 0; i < 18; i++) {
			this.karten.add(new Karte(0, true));
		}
	}

	public static void main(String[] args) {
		Kartenstock ks = new Kartenstock();
		ks.bef�llen();
		ks.mischeKartenstock();
		System.out.println(ks.anzahlKarten());

	}
}

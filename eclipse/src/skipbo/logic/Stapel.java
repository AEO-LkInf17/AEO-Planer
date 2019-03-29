package skipbo.logic;

public class Stapel {
private int MaxKarten;

public Stapel(int MaxKarten) {
	this.MaxKarten = MaxKarten;
}

public int getMaxKarten() {
	return this.MaxKarten;
}
public void setMaxKarten(int MaxKartenNeu) {
	this.MaxKarten = MaxKartenNeu;	
}
}

package skipbo.logic;
import java.util.ArrayList;

public class Spieler {
	//Attribute
	private String name = "";
	private int alter;
	private int posInRunde;
	private Hand Hand;
	//private Spielerstapel sstpl  = new Spielerstapel;
	//private ArrayList<Hilfsstabel> hilfsstapel = new ArrayList<>();
	
	public Spieler(String name, int alter, int posInRunde) {
		this.name = name;
		this.alter = alter;
		this.posInRunde = posInRunde;
	}
	// Methods
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAlter(int alter) {
		this.alter = alter;
	}
	
	public int getAlter() {
		return this.alter;
	}
	
	public void setPosInRunde(int posInRunde) {
		this.posInRunde = posInRunde;
	}
	
	public int getPosInRunde() {
		return this.posInRunde;
	}
	
	public String getSpielerInfo(){
		return "Name: "+ this.name + "\nAlter: " + this.alter + "\nPosition in Runde: " + this.posInRunde;
	}
	
	public static void main(String[] args){
	    Spieler s1 = new Spieler("BK", 12, 1);
	    System.out.println(s1.getSpielerInfo());
	  }
}

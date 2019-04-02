package skipbo.logic;
import java.util.Stack; //Stapel

 /* 
 * @author r_conforti
 */

public class Stapel {

	private Stack<Karte> karten = new Stack <>();

public int getGroesse(){
	return this.karten.size();
	//
}
}


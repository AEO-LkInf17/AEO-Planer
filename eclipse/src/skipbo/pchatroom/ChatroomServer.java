package skipbo.pchatroom;



import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException; 
import java.io.InputStream; 
import java.io.InputStreamReader; 
import java.io.OutputStream; 
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket; 
import java.net.UnknownHostException; 

/** Prototyp Klasse zum Ausprobieren 
 * Chatroom mit Furkan und Jacques
 * 
 * @author Merdan
 * 
 * Diese Klasse ist für den Server, der die ChatroomGUI nutzt.
 */
public class ChatroomServer {
	
	static ServerSocket ss;
	static Socket s;
	static DataInputStream din;
	static DataOutputStream dout;
	
	//private String ip = ChatroomLogin.getText(ip);
	//private String port = ChatroomLogin.getText(port);
	
	public static void main(String[] args) {
		
		String msgin = "";
		try {
			ss= new ServerSocket(port);
		}
		catch(Exception e){
			
		}
		
	}
}

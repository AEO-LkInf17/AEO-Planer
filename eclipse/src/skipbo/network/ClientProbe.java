package skipbo.network;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientProbe {

private Socket socket = null;
private DataInputStream input = null; 
private DataOutputStream out = null;

public ClientProbe(String address, int port)
{
try
{ 
socket = new Socket(address, port); 
System.out.println("Connected"); 
input = new DataInputStream(System.in);
out = new DataOutputStream(socket.getOutputStream());
}
catch(IOException u)
{

}
}
}
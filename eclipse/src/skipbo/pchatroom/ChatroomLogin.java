package skipbo.pchatroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;

/** Login
 * @author Merdan
 * Erste Instanz für den Server um IP und Port zu erfragen.
 */

public class ChatroomLogin extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextArea ipArea = new JTextArea();
	private JTextArea portArea = new JTextArea();
	
	static String ip = "";
	static String port = "";

	/**
	 * Create the frame.
	 */
	public ChatroomLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 167);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		ipArea.setToolTipText("");
		ipArea.setBounds(10, 27, 207, 22);
		contentPane.add(ipArea);
		
		
		portArea.setBounds(10, 78, 207, 22);
		contentPane.add(portArea);
		
		JButton connectBtn = new JButton("Verbinde");
		connectBtn.setBounds(227, 27, 197, 73);
		contentPane.add(connectBtn);
		
		JLabel lblNewLabel = new JLabel("IP");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Port");
		lblNewLabel_1.setBounds(10, 60, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		connectBtn.addActionListener(this);
		
	}
	/** Action-Methode (Fensterklasse)
	 * Ip und Port werden den textAreas entnommen 
	 * und der Inhalt ausgeblendet, sobald der connectionBtn gedrückt wird
	 *
	 */
	public void actionPerformed(ActionEvent e) {
		ip = ipArea.getText().trim();
		port = portArea.getText().trim();    //.trim ist eine Methode die es einem erlaubt überflüssige Leerzeichen zu entfernen
		System.out.println(ip +"\n"+ port);     //"\n" erlaubt es einem eine neue Zeile anzufangen
		contentPane.setVisible(false);
	}

	/**
	 * Main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatroomLogin frame = new ChatroomLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}

package skipbo.prototypes.Chatroom;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/** Loginfenster-Klasse (optional auch für den richtigen Netwerkteil benutzbar)
 * @author Merdan
 *
 */

public class ChatroomLogin extends JFrame {

	private JPanel contentPane;



	/**
	 * Konstruktor
	 */
	public ChatroomLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}
	
	
	
	/**
	 * Main Methode
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

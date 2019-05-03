package skipbo.prototypes.Chatroom;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JLabel;

/** Loginfenster-Klasse (optional auch für den richtigen Netwerkteil benutzbar)
 * @author Merdan
 *
 */

public class ChatroomLogin extends JFrame {

	private JPanel contentPane;

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

	/**
	 * Konstruktor
	 */
	public ChatroomLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList roomList = new JList();
		roomList.setBounds(10, 30, 390, 220);
		contentPane.add(roomList);
		
		JList infoList = new JList();
		infoList.setBounds(410, 30, 364, 220);
		contentPane.add(infoList);
		
		JButton joinBtn = new JButton("Beitritt");
		joinBtn.setBounds(410, 261, 364, 89);
		contentPane.add(joinBtn);
		
		JLabel roomLabel = new JLabel("Raueme");
		roomLabel.setBounds(10, 5, 390, 14);
		contentPane.add(roomLabel);
		
		JLabel infoLabel = new JLabel("Rauminfo");
		infoLabel.setBounds(410, 5, 364, 14);
		contentPane.add(infoLabel);
	}
	
	
	

}

package skipbo.prototypes.Chatroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;

/** Die GUI Klasse des Chatrooms.
 * 
 * @author Merdan
 * 
 * 
 */

public class ChatroomGUI extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatroomGUI frame = new ChatroomGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public ChatroomGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 847, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSende = new JButton("Sende");
		btnSende.setAction(action);
		btnSende.setBounds(688, 308, 133, 135);
		contentPane.add(btnSende);
		
		JTextArea textAreaSchreibfeld = new JTextArea();
		textAreaSchreibfeld.setBounds(10, 308, 668, 135);
		contentPane.add(textAreaSchreibfeld);
		
		JTextArea textAreaChat = new JTextArea();
		textAreaChat.setEditable(false);
		textAreaChat.setBounds(10, 11, 811, 286);
		contentPane.add(textAreaChat);
	}
	
	/** Mit späterer Referenz zur Client Klasse soll das selber geschriebene direkt in den Chat intigriert werden.
	 * 
	 * Problem: Fehler beim Entnehmen des Textes 
	 */
	
		public void actionPerformed(ActionEvent e) {

			String geschriebenes = textAreaSchreibfeld.getText();
			System.out.println(geschriebenes);
		}
	}


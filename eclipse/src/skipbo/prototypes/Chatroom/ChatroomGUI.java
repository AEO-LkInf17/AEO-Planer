package skipbo.prototypes.Chatroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JList;

/** Prototyp Klasse zum Ausprobieren 
 * Chatroom mit Furkan und Jacques.
 * Diese Klasse ist für die allgemeine GUI.
 * 
 * @author Merdan
 * 
 * 
 */


public class ChatroomGUI extends JFrame implements ActionListener {
	
	private DefaultListModel<String> lm = new DefaultListModel<>(); 
	private JList<String> chatListe = new JList<>(lm);
	
	private JButton sendeButton = new JButton("Sende");
	private JTextArea schreibFeld = new JTextArea();
	
	private JPanel contentPane;
	
	
	public ChatroomGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		sendeButton.setBounds(335, 228, 89, 22);
		contentPane.add(sendeButton);
		schreibFeld.setBounds(10, 228, 315, 22);
		contentPane.add(schreibFeld);
		
		chatListe.setBounds(10, 11, 414, 206);
		contentPane.add(chatListe);
		
		sendeButton.addActionListener(this);
		
	}
	
	/** Methode zur Hinzufügung des Geschriebenen in den Chat
	 * zzgl. wird das Schreibfeld geleert
	 */
	
	public void actionPerformed(ActionEvent e) {
		
		lm.addElement("Ich: " + schreibFeld.getText());
		schreibFeld.setText("");
	}
	
	
	
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
}

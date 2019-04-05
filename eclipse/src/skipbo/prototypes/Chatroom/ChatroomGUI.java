package skipbo.prototypes.Chatroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.Box;
import java.awt.SystemColor;
import javax.swing.JList;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;

public class ChatroomGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public ChatroomGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 920, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JTextArea textAreaSchreibfeld = new JTextArea();
		textAreaSchreibfeld.setBounds(10, 325, 771, 147);
		textAreaSchreibfeld.setBackground(Color.LIGHT_GRAY);
		contentPane.add(textAreaSchreibfeld);
		


		
		JButton btnSende = new JButton("Sende");
		btnSende.setBounds(791, 325, 103, 147);
		btnSende.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnSende);
		
		JTextArea textAreaChat = new JTextArea();
		textAreaChat.setEditable(false);
		textAreaChat.setBounds(10, 11, 884, 303);
		contentPane.add(textAreaChat);
		
		//textArea.setLocation(500,500);
		//textArea.setSize(int 50, int 50)
	}
}

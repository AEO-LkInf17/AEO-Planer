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
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.X_AXIS));
		
		JFormattedTextField formattedTextFieldChat = new JFormattedTextField();
		formattedTextFieldChat.setEditable(false);
		contentPane.add(formattedTextFieldChat);
		
		JTextArea textAreaschreibfeld = new JTextArea();
		textAreaschreibfeld.setBackground(Color.LIGHT_GRAY);
		contentPane.add(textAreaschreibfeld);
		
		JButton btnSende = new JButton("Sende");
		btnSende.setAlignmentX(Component.CENTER_ALIGNMENT);
		contentPane.add(btnSende);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		contentPane.add(verticalStrut);
		
		//textArea.setLocation(500,500);
		//textArea.setSize(int 50, int 50)
	}
	

}

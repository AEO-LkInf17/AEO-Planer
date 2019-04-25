package skipbo.prototypes.Chatroom;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class ChatroomGUI extends JFrame implements ActionListener {

	
	JButton sendeButton = new JButton();
	
	private JPanel contentPane;
	
	
	public ChatroomGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton sendeButton = new JButton("Sende");
		sendeButton.setBounds(335, 187, 89, 63);
		contentPane.add(sendeButton);
		
		JTextArea schreibFeld = new JTextArea();
		schreibFeld.setBounds(10, 187, 315, 63);
		contentPane.add(schreibFeld);
		
		JTextArea chatFeld = new JTextArea();
		chatFeld.setEditable(false);
		chatFeld.setBounds(10, 11, 414, 158);
		contentPane.add(chatFeld);
		
		sendeButton.addActionListener(this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String contents = schreibFeld.getText();
		System.out.println(contents);  //schreibFeld.getText()
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

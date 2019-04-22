import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 12.04.2019
  * @author 
  */

public class ChatroomGUI extends JFrame {
  // Anfang Attribute
  String[] ChatListInhalt = {"one", "two", "three", "four"};
  
  private JTextArea jTextArea2 = new JTextArea("");
  private JScrollPane jTextArea2ScrollPane = new JScrollPane(jTextArea2);
  private JButton jButton1 = new JButton();
  
  private JList<String> jList1 = new JList<String>(ChatListInhalt);
  
  private DefaultListModel jList1Model = new DefaultListModel();
  private JScrollPane jList1ScrollPane = new JScrollPane(jList1);
    
    
  // Ende Attribute
  
  public ChatroomGUI(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 924; 
    int frameHeight = 565;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    jTextArea2ScrollPane.setBounds(8, 360, 680, 164);
    cp.add(jTextArea2ScrollPane);
    jButton1.setBounds(720, 360, 195, 161);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
      }
    });
    cp.add(jButton1);
    jList1.setModel(jList1Model);
    jList1ScrollPane.setBounds(8, 8, 902, 340);
    cp.add(jList1ScrollPane);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public ChatroomGUI
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    DefaultListModel.add(0, "Programmieren");                                //(chatverlaufanzahl, "Programmieren"); 
  } // end of jButton1_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new ChatroomGUI("ChatroomGUI");
  } // end of main
  
} // end of class ChatroomGUI

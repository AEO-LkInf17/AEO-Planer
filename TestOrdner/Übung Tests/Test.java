import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
  *
  * Beschreibung
  *
  * @version 1.0 vom 19.10.2018
  * @author 
  */

public class Test extends JFrame {
  // Anfang Attribute
  private JLabel jLabel1 = new JLabel();
  private JLabel lZahl1 = new JLabel();
  private JLabel jLabel3 = new JLabel();
  private JButton jButton1 = new JButton();
  private JButton jButton2 = new JButton();
  
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JTextField jTextField3 = new JTextField();
  // Ende Attribute
  
  public Test(String title) { 
    // Frame-Initialisierung
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 500; 
    int frameHeight = 500;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    
    
    
    
    jLabel1.setBounds(128, 208, 198, 52);
    jLabel1.setText("Ergebnis");
    cp.add(jLabel1);
    lZahl1.setBounds(40, 72, 179, 25);
    lZahl1.setText("Zahl 1");
    cp.add(lZahl1);
    jLabel3.setBounds(264, 64, 179, 33);
    jLabel3.setText("Zahl 2");
    cp.add(jLabel3);
    jButton1.setBounds(72, 160, 105, 25);
    jButton1.setText("Plus");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton1_ActionPerformed(evt);
        
      }
    });
    cp.add(jButton1);
    jButton2.setBounds(272, 160, 131, 25);
    jButton2.setText("Minus");
    jButton2.setMargin(new Insets(2, 2, 2, 2));
    jButton2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        jButton2_ActionPerformed(evt);
        
        
      }
    });
    cp.add(jButton2);
    jTextField1.setBounds(40, 104, 185, 49);
    cp.add(jTextField1);
    
    
    jTextField2.setBounds(264, 104, 185, 49);
    cp.add(jTextField2);
    
    
    
    jTextField3.setBounds(128, 264, 201, 49);
    cp.add(jTextField3);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Test
  
  // Anfang Methoden
  public void jButton1_ActionPerformed(ActionEvent evt) {
    int a,b,c;
    try{
      a = Integer.parseInt(jTextField1.getText());
      b = Integer.parseInt(jTextField2.getText()); 
      
      c = a+b;
      jTextField3.setText(Integer.toString(c));
    }
    catch(NumberFormatException e){
      JOptionPane.showMessageDialog(null,"Bitte geben Sie eine gültige Zahl ein, Sie Hirni!");
    } 
    
    
    
  } // end of jButton1_ActionPerformed
  
  public void jButton2_ActionPerformed(ActionEvent evt) {
    int a,b,c;
    try{
      a = Integer.parseInt(jTextField1.getText());
      b = Integer.parseInt(jTextField2.getText()); 
      
      c = a-b;
      jTextField3.setText(Integer.toString(c));
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null,"Gib gültige Zahl ein");
    } 
    
    
    // TODO hier Quelltext einfügen
  } // end of jButton2_ActionPerformed
  
  // Ende Methoden
  
  public static void main(String[] args) {
    new Test("Test"); 
  } // end of main
  
} // end of class Test

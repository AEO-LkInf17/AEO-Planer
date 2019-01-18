import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


/**
 *
 * Description
 *
 * @version 1.0 from 13.11.2018
 * @Dawid
 */

public class TestFrame1 extends JFrame implements ActionListener, ChangeListener{
  
  
  // start attributes
  // Anfang Attribute
  private JButton a = new JButton();
  private JButton b = new JButton();
  private JButton c = new JButton();
  private JTextField jTextField1 = new JTextField();
  private JTextField jTextField2 = new JTextField();
  private JLabel lWelcometomyTestFrame = new JLabel();
  private JNumberField num1 = new JNumberField();
  private JLabel lHowmanytimesabuttongotclicked = new JLabel();
  private JButton ExplorerButton = new JButton();
  private JTextArea FoundMe = new JTextArea("");
  private JScrollPane FoundMeScrollPane = new JScrollPane(FoundMe);
  private JCheckBox jCheckBox1 = new JCheckBox("Enjoy?");
  private JRadioButton rbM = new JRadioButton();
  private JRadioButton rbW = new JRadioButton();
  private JRadioButton rbNothingofthese = new JRadioButton();
  private JLabel lGender = new JLabel();
  private JSpinner jSpinner1 = new JSpinner();
  private SpinnerNumberModel jSpinner1Model = new SpinnerNumberModel(0, -100, 100, 5);
  private JLabel lFindtherightnumber = new JLabel();
  private JLabel lResizeitformore1 = new JLabel();
  // end attributes
  
  
  private int res=0;
  private int ab;
  private int bk;
  
  
  private int result=0;
  private String Text="Wow you found me! Good job!";
  private JLabel FunnyPic = new JLabel();
  private JProgressBar jProgressBar1 = new JProgressBar();
  private JSlider jSlider1 = new JSlider();
  private JNumberField SliderField = new JNumberField();
  private JButton jButton1 = new JButton();
  // Ende Attribute
  
  public TestFrame1() { 
    // Frame-Init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 362; 
    int frameHeight = 576;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("TestFrame1");
    setResizable(true);
    Container cp = getContentPane();
    cp.setLayout(null);
    // start components
    
    //a
    a.setBounds(64, 40, 193, 33);
    a.setText("a");
    a.setMargin(new Insets(2, 2, 2, 2));
    a.addActionListener(this);
    cp.add(a);
    
    //b
    b.setBounds(64, 96, 193, 33);
    b.setText("b");
    b.setMargin(new Insets(2, 2, 2, 2));
    b.addActionListener(this);
    cp.add(b);
    
    //c
    c.setBounds(64, 152, 193, 33);
    c.setText("c");
    c.setMargin(new Insets(2, 2, 2, 2));
    c.addActionListener(this);
    cp.add(c);
    
    //Text Field 1
    jTextField1.setBounds(48, 232, 233, 57);
    jTextField1.setText("Feld 1");
    cp.add(jTextField1);
    
    //Text Field 2
    jTextField2.setBounds(48, 312, 233, 57);
    jTextField2.setText("Feld 2");
    cp.add(jTextField2);
    lWelcometomyTestFrame.setBounds(64, 8, 185, 19);
    lWelcometomyTestFrame.setText("Welcome to my Test Frame!");
    cp.add(lWelcometomyTestFrame);
    num1.setBounds(56, 416, 217, 33);
    num1.setText("");
    cp.add(num1);
    lHowmanytimesabuttongotclicked.setBounds(56, 448, 225, 25);
    lHowmanytimesabuttongotclicked.setText("How many times a button got clicked!");
    cp.add(lHowmanytimesabuttongotclicked);
    cp.setBackground(Color.GRAY);
    ExplorerButton.setBounds(424, 248, 161, 33);
    ExplorerButton.setText("ExplorerButton");
    ExplorerButton.setMargin(new Insets(2, 2, 2, 2));
    ExplorerButton.addActionListener(this);
    cp.add(ExplorerButton);
    FoundMeScrollPane.setBounds(424, 304, 233, 41);
    cp.add(FoundMeScrollPane);
    jCheckBox1.setBounds(424, 384, 108, 20);
    jCheckBox1.addActionListener(this);
    jCheckBox1.setOpaque(false);
    
    
    cp.add(jCheckBox1);
    rbM.setBounds(424, 464, 36, 20);
    rbM.setOpaque(false);
    rbM.setText("m");
    rbM.addActionListener(this);
    cp.add(rbM);
    rbW.setBounds(464, 464, 36, 20);
    rbW.setOpaque(false);
    rbW.setText("w");
    rbW.addActionListener(this);
    cp.add(rbW);
    rbNothingofthese.setBounds(504, 464, 116, 20);
    rbNothingofthese.setOpaque(false);
    rbNothingofthese.setText("Nothing of these");
    rbNothingofthese.addActionListener(this);
    cp.add(rbNothingofthese);
    lGender.setBounds(432, 440, 105, 19);
    lGender.setText("Gender?");
    cp.add(lGender);
    
    jSpinner1.setBounds(424, 184, 145, 33);
    jSpinner1.setValue(0);
    jSpinner1.setModel(jSpinner1Model);
    jSpinner1.addChangeListener(this);
    cp.add(jSpinner1);
    
    lFindtherightnumber.setBounds(424, 160, 145, 19);
    lFindtherightnumber.setText("Find the right number!");
    cp.add(lFindtherightnumber);
    FunnyPic.setBounds(408, 88, 219, 41);
    FunnyPic.setText("Good job!");
    
    // Anfang Komponenten
    FunnyPic.setBounds(408, 88, 219, 41);
    FunnyPic.setText("text");
    cp.add(FunnyPic);
    cp.add(FunnyPic);
    FunnyPic.setVisible(false);
    lResizeitformore1.setBounds(184, 200, 121, 20);
    lResizeitformore1.setText("Resize it for more! ->");
    cp.add(lResizeitformore1);
    // end components
    
    jSpinner1.addChangeListener(this);
    
    
    jProgressBar1.setBounds(752, 312, 225, 33);
    cp.add(jProgressBar1);
    jSlider1.setBounds(704, 168, 193, 49);
    jSlider1.setMinorTickSpacing(10);
    jSlider1.setMajorTickSpacing(50);
    jSlider1.setPaintTicks(true);
    jSlider1.setPaintLabels(true);
    jSlider1.setBackground(Color.GRAY);
    jSlider1.addChangeListener(this);
    cp.add(jSlider1);
    SliderField.setBounds(696, 104, 233, 49);
    SliderField.setText("");
    cp.add(SliderField);
    jButton1.setBounds(808, 360, 121, 25);
    jButton1.setText("jButton1");
    jButton1.setMargin(new Insets(2, 2, 2, 2));
    jButton1.addActionListener(this);
    cp.add(jButton1);
    // Ende Komponenten
    
    FunnyPic.setVisible(false);
    setVisible(true);
  } // end of public TestFrame1
  
  // Anfang Methoden
  
  // start methods
  
  public static void main(String[] args) {
    new TestFrame1();
  } // end of main
  
  
  
  public void actionPerformed(ActionEvent e)
  {
    int clicked=0;
    
    int ac=10;
    if (e.getSource() == jButton1 ) {
      res = res +ac;
      jProgressBar1.setValue(res);
      
    } // end of if
    
    if (e.getSource() == a) {
      jTextField1.setText("a");
      clicked++;
    } // end of if
    if (e.getSource() == b) {
      jTextField1.setText("b");
      clicked++;
    } // end of if
    if (e.getSource() == c) {
      jTextField2.setText("c");
      clicked++;
    } // end of if
    if (e.getSource() == ExplorerButton) {
      FoundMe.setText(Text);
      clicked++;
    } // end of if
    
    if (e.getSource() == jCheckBox1 && jCheckBox1.isSelected())
    {
      jCheckBox1.setText("Thanks");
      
    }   
    if (e.getSource() == jCheckBox1 && jCheckBox1.isSelected()== false)
    {
      jCheckBox1.setText("Why?");
      
    }     
    
    if (e.getSource() == rbM && rbM.isSelected()) {
      rbNothingofthese.setSelected(false);
      rbW.setSelected(false);
    } // end of if
    if (e.getSource() == rbW && rbW.isSelected()) {
      rbNothingofthese.setSelected(false);
      rbM.setSelected(false);
    } // end of if
    if (e.getSource() == rbNothingofthese && rbNothingofthese.isSelected()) {
      rbW.setSelected(false);
      rbM.setSelected(false);
    } // end of if
    
    
    
    result = result+clicked;
    num1.setText(Integer.toString(result));
    
  }
  
  
  public void stateChanged(ChangeEvent evt)
  {
    
    if (evt.getSource() == jSlider1) {
      
      
      
      SliderField.setText(Integer.toString(jSlider1.getValue()));
      
    } // end of if
    
    
    if (evt.getSource() == jSpinner1Model && jSpinner1Model.getNumber().equals(50))
    {
      
      FunnyPic.setVisible(true);
      
    } // end of if
    else {
      FunnyPic.setVisible(false);
      
      
    }
  }
  public void jButton1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
  } // end of jButton1_ActionPerformed
  
  // Ende Methoden
  
}
    
    
  
  
  // end methods
// end of class TestFrame1


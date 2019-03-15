package skipbo.prototypes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.dnd.DropTargetListener;
import java.io.IOException;

public class PrototypSkipBoDnD extends JFrame {
  
  public PrototypSkipBoDnD(String title) { 
    
    super(title);
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 300; 
    int frameHeight = 300;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    Panel panel = new Panel();
    Frame frame = new Frame();
    
    
    DraggableTextField jf1 = new DraggableTextField("Hello");
    jf1.setBounds(16, 224, 121, 33);
    jf1.setEditable(false);
    jf1.setDragEnabled(true);
    DraggableTextField jf2 = new DraggableTextField("Bye");
    jf2.setBounds(152, 224, 129, 33);
    jf2.setEditable(false);
    jf2.setDragEnabled(true);
    cp.add(jf2);
    cp.add(jf1);
    
        
    DropTargetLabel l1 = new DropTargetLabel();
    l1.setText("Gib mir ein Wort!");
    l1.setBounds(72, 80, 147, 49);
    cp.add(l1);
    
    setVisible(true);
  } 
  public static void main(String[] args) {
    new PrototypSkipBoDnD("PrototypSkipBoDnD");
  }
  
  
  
  public class DropTargetLabel extends Label implements DropTargetListener {
    
    public DropTargetLabel() {
      
    new DropTarget(this, this);
    }
    
    public void dragEnter(DropTargetDragEvent evt) {
      
    }
    
    public void dragOver(DropTargetDragEvent evt) {
      
    }
    
    public void dragExit(DropTargetEvent evt) {
      
    }
    
    public void dropActionChanged(DropTargetDragEvent evt) {
      
    }
    
    public void drop(DropTargetDropEvent evt) {
      
      // Called when the user finishes or cancels the drag operation
      
      try {
        
        Transferable transferable = evt.getTransferable();
        
        if (transferable.isDataFlavorSupported(DataFlavor.stringFlavor)) {
          
          evt.acceptDrop(DnDConstants.ACTION_COPY_OR_MOVE);
          
          String dragContents = (String) transferable.getTransferData(DataFlavor.stringFlavor);
          
          evt.getDropTargetContext().dropComplete(true);
          
          // We append the label text to the text area when dropped
          
          setText(" " + dragContents);
          
        } else {
          
          evt.rejectDrop();
          
        }
        
      } catch (IOException e) {
        
        evt.rejectDrop();
        
      } catch (UnsupportedFlavorException e) {
        
        evt.rejectDrop();
        
      }
    }
    
  }
  
  
  
  
  
  public  class DraggableTextField extends JTextField implements DragGestureListener, DragSourceListener {
    DragSource dragSource;
    
    public DraggableTextField(String text) {
      
      setText(text);
      
      
      
      
      dragSource = new DragSource();
      
      dragSource.createDefaultDragGestureRecognizer(this, DnDConstants.ACTION_COPY_OR_MOVE, this);
    }
    
    public void dragGestureRecognized(DragGestureEvent evt) {
    	
      
      Transferable transferable = new StringSelection(getText());
      
      dragSource.startDrag(evt, DragSource.DefaultLinkDrop, transferable, this);
    }
    
    public void dragEnter(DragSourceDragEvent evt) {
    }
    
    public void dragOver(DragSourceDragEvent evt) {
      
    }
    
    public void dragExit(DragSourceEvent evt) {
      
    }
    
    public void dropActionChanged(DragSourceDragEvent evt) {
      
    }
    
    public void dragDropEnd(DragSourceDropEvent evt) {
      
    }
   
    
    
  }
  
  
  
} 


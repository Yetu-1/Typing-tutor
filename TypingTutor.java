/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JScrollPane;

public class TypingTutor extends JFrame implements ActionListener {
    private final Container myContainer;
    private final BorderLayout baseLayout;
    private final JTextArea textArea;
    
    
    public TypingTutor(){
        super("Typing Tutor");
        
        myContainer = null;
        baseLayout = new BorderLayout(10,10);
        
        
        textArea = new JTextArea(7,7);
        textArea.setEditable(false);
        add(textArea,BorderLayout.NORTH);
        
        setLayout(baseLayout);
        
        
        
        
    }
    
    
    @Override
    public  void actionPerformed(ActionEvent event){
        
    }
    
}

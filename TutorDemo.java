/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import javax.swing.JFrame;

public class TutorDemo {
    public static void main(String[] args){
        
        TypingTutor tutor = new TypingTutor();
        tutor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tutor.setSize(750,400);
        tutor.setVisible(true);
        
        
    }
}

package src;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class Frame extends JFrame{

    public Frame(){
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("Gibberish");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add logo to assets folder 
        //ImageIcon icon = new ImageIcon("assets/logo.png");

        frame.setVisible(true);
    }
    
}

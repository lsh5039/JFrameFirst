package project9_6;

import java.awt.*;
import javax.swing.*;
 
public class Main extends JFrame {
    Main(){
        setTitle("Random Labels");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        Container c = getContentPane();
        c.setLayout(null);
        for(int i=1;i<=20;i++){
            JLabel label = new JLabel();
            int x = (int)(Math.random()*200)+50; 
            int y = (int)(Math.random()*200)+50; 
            label.setLocation(x,y); 
            label.setBackground(Color.BLUE);
            label.setSize(10,10); 
            c.add(label);
            label.setOpaque(true); 
        }
        setSize(300,300);
    }
    public static void main(String[] args) {

        new Main();
    }
}
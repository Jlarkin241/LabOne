package Framework;

import GUI.RegisterPanel;

import javax.swing.*;
import java.awt.*;

public class MakingChange extends JFrame {
    public MakingChange() {
        // Create a new JFrame
        JFrame frame = new JFrame("Making Change");//creates frame objects and titles upper window
       // frame.setPreferredSize(new Dimension(800, 600));
        // frame.setSize(500, 500);//adjust size by pixel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close program when user toggles x
        frame.getContentPane().add(new RegisterPanel());
        frame.setVisible(true); //makes panel visible
        frame.pack();

    }
    public static void main(String[] args) {
         new MakingChange();


    }

}


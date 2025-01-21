import javax.swing.*;

import static java.awt.Color.red;

public class MakingChange {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Making Change");//creates frame objects and titles upper window
        frame.setSize(500, 500);//adjust size by pixel
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close program when user toggles x
        frame.setVisible(true); //makes panel visible
        frame.getContentPane().setBackground(red); //sets color


    }

}


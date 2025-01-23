package Framework;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {

   public RegisterPanel() {
      //creates buttons
      JButton toggle = new JButton("Toggle");
      toggle.addActionListener(new Listener());
      //sets background of button to green
      toggle.setBackground(Color.green);
      //sets text to color??
      toggle.setForeground(Color.yellow);
      add(toggle);
      //setting background color
      setBackground(Color.WHITE);
      //setting size of panel
      setSize(500,500);
      JLabel registerLabel = new JLabel("Register");
      ImageIcon pic = new ImageIcon("images/penny.jpg");

      registerLabel.setIcon(pic);
      add(registerLabel);

   }
   private class Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
         JOptionPane.showMessageDialog(RegisterPanel.this, "You are now registered");

      }
   }

}



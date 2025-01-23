package Framework;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
   private JTextField textField;
   private JLabel label;
   private JButton button;
   //private ImageIcon image;
   public RegisterPanel() {

      label = new JLabel();
     // image = new ImageIcon("images/penny.jpg");
      textField= new JTextField(10);
      add(textField);
      button = new JButton("Break Change");
      button.addActionListener(new Listener());
      //sets background of button to green
      button.setBackground(Color.green);
      //sets text to color??
      button.setForeground(Color.yellow);
      add(button);
      //setting background color
      setBackground(Color.WHITE);
      //setting size of panel
      //setSize(500,500);

   }
   private class Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
      String text = textField.getText();
      double input = Double.parseDouble(text);

         //new Register().makeChange(input);


      }
   }

}



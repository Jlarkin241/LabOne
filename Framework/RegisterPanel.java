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

      textField= new JTextField(10);
      add(textField);
      button = new JButton("Break Change");
      button.addActionListener(new Listener());
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
      Purse purse = new Register().makeChange(input);
      System.out.println(purse.toString() + "Wallet: $" + purse.getValue());



      }
   }

}



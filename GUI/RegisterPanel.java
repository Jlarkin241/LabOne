package GUI;
import Framework.Purse;
import Framework.Register;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegisterPanel extends JPanel {
   private JTextField textField;
   private JLabel label;
   private JButton button;
   private PursePanel changePanel;
   private Register register = new Register();



   public RegisterPanel() {
      this.setPreferredSize(new Dimension(1000, 1000));
      this.setBackground(Color.white);

      JPanel upperPanel = new JPanel();
      upperPanel.setBackground(Color.PINK);
      upperPanel.setPreferredSize(new Dimension(970, 300));

      changePanel = new PursePanel();


      label = new JLabel("Enter Deposit: ");
      upperPanel.add(label);
      textField= new JTextField(5);
      upperPanel.add(textField);
      button = new JButton("Break Change");
      button.addActionListener(new Listener());
      upperPanel.add(button);


      add(upperPanel);
      add(changePanel);


      //setting background color

      //setting size of panel



   }

   private class Listener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
      String text = textField.getText();
      double input = Double.parseDouble(text);
      Purse purse = register.makeChange(input);
      //Prints console output;
      System.out.println("Wallet contents:\n" + purse.toString()  + "Total value: $" + purse.getValue() + '\n');

          changePanel.setPreferredSize(new Dimension(900, 800));
          changePanel.setBackground(Color.BLUE);

          //Sets the change panel and add to inputPanel
          changePanel.setPurse(purse);


          changePanel.revalidate();
          changePanel.repaint();




      }
   }

}



package GUI;

import Framework.Denomination;
import Framework.Purse;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class PursePanel extends JPanel {
    //creat purse
    private Purse purse = new Purse();

    //set the purse
    public void setPurse(Purse purse) {
        this.purse = purse;
    }


}


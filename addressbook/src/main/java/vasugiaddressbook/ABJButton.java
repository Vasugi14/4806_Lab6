package vasugiaddressbook;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ABJButton extends JButton {

    private ActionListener listener;

    public ABJButton() {
        super("AddressBook");
    }

    public void setActionListener(ActionListener listener) {
        this.listener = listener;
    }

    public void init() {
        this.addActionListener(listener);
    }

}
package vasugiaddressbook;

import javax.swing.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ABJTextArea extends JTextArea implements PropertyChangeListener {

    public void update(Object arg) {
        append(arg.toString() + "\n");
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("Variation of " + evt.getPropertyName());
        System.out.println("\t(" + evt.getOldValue() +
                " -> " + evt.getNewValue() + ")");
        System.out.println("Property in object " + evt.getSource());
    }
}

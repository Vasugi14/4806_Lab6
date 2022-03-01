package vasugiaddressbook;

import javax.swing.*;

public class ABJPanel extends JPanel {

    private ABJTextArea area;
    private ABJButton button;
    private AddressBook addressBook;

    public ABJPanel() {}

    public void setArea(ABJTextArea area) {
        this.area = area;
    }

    public void setAddressBook(AddressBook addressBook) {
        this.addressBook = addressBook;
    }

    public void setButton(ABJButton button) {
        this.button = button;
    }

    public void init() {
        add(area);
        add(button);
        addressBook.addObserver(area);
    }
}
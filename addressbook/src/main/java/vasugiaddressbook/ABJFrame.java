package vasugiaddressbook;

import javax.swing.*;

public class ABJFrame extends JFrame{

    private ABJPanel panel;
    private String name;

    public ABJFrame() {
    }

    public void setPanel(ABJPanel panel) {
        this.panel = panel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init() {
        setContentPane(panel);
        setVisible(true);
        setSize(500,500);
    }
}
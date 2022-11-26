package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PopUpWidget extends JFrame implements ActionListener {

    private final MacAddress mac;
    private final String manufacturer;

    public PopUpWidget(MacAddress mac, String manufacturer) throws HeadlessException {
        this.mac = mac;
        this.manufacturer = manufacturer;
    }

    public void display() {
        new Timer(11, this);
    }

    public void close() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

package classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingPopUpWidget extends JFrame implements ActionListener, PopUpWidget {

    private final MacAddress mac;
    private final String manufacturer;

    public SwingPopUpWidget(MacAddress mac, String manufacturer) throws HeadlessException {
        this.mac = mac;
        this.manufacturer = manufacturer;
    }

    @Override
    public void display() {
        new Timer(11, this);
    }

    @Override
    public void close() {

    }

    @Override
    public void setOpacity(float opacity) {
        super.setOpacity(opacity);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}

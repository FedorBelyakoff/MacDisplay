package interfaces;

import javax.swing.*;
import java.awt.event.ActionListener;

public interface TimerFactory {
    Timer newInstance(int updateTimeMSec, ActionListener listener);
}

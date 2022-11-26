package classes;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import interfaces.TextBuffer;
import org.apache.log4j.Logger;

import javax.swing.*;



public class FormatDaemon extends JFrame implements Runnable {
    private static final Logger LOG = Logger.getLogger(FormatDaemon.class);
    private final TextBuffer buffer;


    public static void main(String[] args) {
        LOG.debug("FormatDaemon is running.");
        try {
            Injector injector = Guice.createInjector(new DaemonModule());
            FormatDaemon daemon = injector.getInstance(FormatDaemon.class);
            SwingUtilities.invokeLater(daemon);
        } catch (Exception e) {
            LOG.error(e);
        }
    }

    @Inject
    public FormatDaemon(TextBuffer buffer) {
        this.buffer = buffer;
    }


    @Override
    public void run() {
        while (true) {
            LOG.debug("Run - new iteration.");
            if (!buffer.isEmpty()) {
                update();
            }
            int updateTimeMSec = 2_000;
            sleep(updateTimeMSec);
        }
    }


    public void update() {

    }




    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

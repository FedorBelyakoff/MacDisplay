package classes;

import com.google.inject.Inject;
import interfaces.TimerFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static classes.WidgetTimer.Stage.OPAQUE;
import static classes.WidgetTimer.Stage.TRANSPARENT;

public class WidgetTimer implements ActionListener {

    private final PopUpWidget widget;
    private final int opaquePhaseSec;
    private final int transparentPhaseSec;
    private final TimerFactory timerFactory;

    private RunningStage stage;

    @Inject
    public WidgetTimer(PopUpWidget widget,
                       TimerFactory timerFactory,
                       int opaquePhaseSec,
                       int transparentPhaseSec) {
        this.widget = widget;
        this.opaquePhaseSec = opaquePhaseSec;
        this.transparentPhaseSec = transparentPhaseSec;
        this.timerFactory = timerFactory;
    }

    public void start() {
        beginOpaqueStage();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (stage != null && stage.isStarted()) {
            stage.actionPerformed(e);
        }
    }

    private void closeWidget() {
        widget.close();
    }

    public void beginTransparentStage() {
        if (stage != null && stage.isStarted()) {
            stage.stop();
        }
        stage = new TransparentStage(this);
        stage.start();
    }

    public void beginOpaqueStage() {
        if (stage != null && stage.isStarted()) {
            stage.stop();
        }
        stage = new OpaqueStage(this);
        stage.start();
    }

    public enum Stage {
        OPAQUE, TRANSPARENT
    }

    private interface RunningStage extends ActionListener {
        Stage type();

        void start();

        void stop();

        boolean isStarted();
    }

    private class OpaqueStage implements RunningStage {

        private final WidgetTimer listener;
        private Timer timer;

        public OpaqueStage(WidgetTimer listener) {
            this.listener = listener;
        }

        @Override
        public Stage type() {
            return OPAQUE;
        }


        @Override
        public void start() {
            if (isStarted()) {
                throw new IllegalStateException();
            }
            timer = timerFactory.newInstance(
                    opaquePhaseSec * 1000, this);
            timer.setRepeats(false);
            timer.start();
        }

        @Override
        public void stop() {
            if (!isStarted()) {
                throw new IllegalStateException();
            }
            timer.stop();
        }

        @Override
        public boolean isStarted() {
            return timer != null && timer.isRunning();
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if (timer != e.getSource()) {
                throw new InternalError();
            }
            listener.beginTransparentStage();
        }
    }


    private class TransparentStage implements RunningStage {


//        public static final int UPDATE_TIME_M_SEC = 200;

        private int updateTimeMSec;

        private static final int N_STEPS = 10;


        private final WidgetTimer listener;

        private int stepCounter;
        private Timer timer;


        public TransparentStage(WidgetTimer listener) {
            this.listener = listener;
        }

        @Override

        public Stage type() {
            return TRANSPARENT;
        }


        @Override
        public void start() {
            updateTimeMSec = (transparentPhaseSec * 1000) / N_STEPS;
            this.stepCounter = N_STEPS;
            timer = timerFactory.newInstance(updateTimeMSec, this);
            timer.setRepeats(true);
        }

        @Override
        public void stop() {
            timer.stop();
        }

        @Override
        public boolean isStarted() {
            return timer != null && timer.isRunning();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            if (timer != e.getSource()) {
                throw new InternalError("");
            }
            stepCounter--;
            if (stepCounter == 0) {
                listener.closeWidget();
            }
            String opacityStr = String.format("0.%sf", stepCounter);
            float opacity = Float.parseFloat(opacityStr);
            widget.setOpacity(opacity);
        }
    }


}

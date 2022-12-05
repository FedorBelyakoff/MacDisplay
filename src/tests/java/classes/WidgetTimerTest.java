package classes;

import interfaces.TimerFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.event.ActionEvent;

import static org.mockito.Mockito.*;

class WidgetTimerTest {

    private WidgetTimer timer;
    private SwingPopUpWidget widget;
    private ActionEvent e;
    private Timer swingTimer;

    @BeforeEach
    void setUp() {
        widget = mock(SwingPopUpWidget.class);
        TimerFactory factory = mock(TimerFactory.class);
        swingTimer = mock(Timer.class);
        when(factory.newInstance(anyInt(), any())).thenReturn(swingTimer);
        timer = new WidgetTimer(widget, factory, 1, 1);
        e = mock(ActionEvent.class);
        when(e.getSource()).thenReturn(swingTimer);
    }


    @Test
    void shouldBeginChangeOpacityAfterOpacityStageTime() {
        timer.start();
        timer.actionPerformed(e); //1
//        timer.actionPerformed(e); //2
//        timer.actionPerformed(e); //3
//        timer.actionPerformed(e); //4
        timer.actionPerformed(e); //5
        verify(widget).setOpacity(0.9f);
    }


    @Test
    void shouldCloseWidgetWhenTransparentTimeIsOut() {
        timer.start();
        when(swingTimer.isRunning()).thenReturn(true);
        //Opaque phase
        timer.actionPerformed(e); //1
        when(swingTimer.isRunning()).thenReturn(false);
        //Transparent phase
        timer.actionPerformed(e); //1
        when(swingTimer.isRunning()).thenReturn(true);
        timer.actionPerformed(e); //2
        timer.actionPerformed(e); //3
        timer.actionPerformed(e); //4
        timer.actionPerformed(e); //5
        timer.actionPerformed(e); //5
        verify(widget).close();
    }

    @Test
    void shouldChangeOpacityBySteps() {
//        timer.start();
//        timer.beginOpaqueStage();
//        verify(widget).setOpacity(1.0f);
//        when(swingTimer.isRunning()).thenReturn(true);

        when(swingTimer.isRunning()).thenReturn(false);
        timer.beginTransparentStage();
        when(swingTimer.isRunning()).thenReturn(true);
        timer.actionPerformed(e);
//        verify(widget).setOpacity(1.0f);
//        timer.actionPerformed(e);
        verify(widget).setOpacity(0.9f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.8f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.7f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.6f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.5f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.4f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.3f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.2f);
        timer.actionPerformed(e);
        verify(widget).setOpacity(0.1f);
    }
}
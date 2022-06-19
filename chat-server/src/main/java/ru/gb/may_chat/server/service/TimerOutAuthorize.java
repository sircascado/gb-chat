package ru.gb.may_chat.server.service;

import java.util.Timer;
import java.util.TimerTask;

public class TimerOutAuthorize extends TimerTask {

    private Thread thread;
    private Timer timer;

    public TimerOutAuthorize(Thread thread, Timer timer) {
        this.thread = thread;
        this.timer = timer;
    }

    @Override
    public void run() {
        if(thread != null && thread.isAlive()) {
            thread.interrupt();
            timer.cancel();
        }
    }

}

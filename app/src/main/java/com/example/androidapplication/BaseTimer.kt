package com.example.androidapplication;
import java.util.Timer;
import java.util.TimerTask;
public class BaseTimer{
    private boolean isRunning = false;
    private int seconds = 10;
    private Timer timer;
    private TimerTask task;

    public BaseTimer(int initialSeconds){
        this.seconds = intialSeconds;
    }
        public void start() {
            if (isRunning){ return;
            }
            isRunning = true;
            timer = new Timer();
            task = new TimerTask() {
                @Override
                public void run() {
                    if (seconds > 0) {
                        System.out.print(seconds);
                        seconds--;
                    } else {
                        timer.cancel();
                        isRunning = false;
                        System.out.print("Done");
                    }
                }
            };

                    timer.schedule(task, 1000, 1000);
    }
        public static void pause(){
            if (isRunning && timer != null) {
                timer.cancel();
                isRunning = false;
                System.out.println("Paused");
            }
    }
        public static void reset(int newSeconds){
            pause();
            this.seconds = newSeconds;
            System.out.println("Timer Reset");
}
        public int getRemainingSeconds () {
            return seconds;
        }
package com.example.androidapplication;
public abstract class BaseTimer {
    private int hour;
    private int min;
    private int sec;

    private boolean isRunning;
    public Timer(){
        this.hour = 0;
        this.min = 0;
        this.sec = 0;
        isRunning = false;
    }

    public timeMoves(){

    }

    public void start() {
        isRunning = true;
    }

    public void pause(){
        isRunning = false;

    }
    public void reset(){
        isRunning = true;
    }

}

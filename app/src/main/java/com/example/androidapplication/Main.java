package com.example.androidapplication;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BaseTimer timer = new BaseTimer(10); // Create a timer with 10 seconds

        timer.start();
        Thread.sleep(5000);

        timer.pause();
        Thread.sleep(2000);

        timer.start();
        Thread.sleep(3000);

        timer.reset(15);
        timer.start();
    }
}
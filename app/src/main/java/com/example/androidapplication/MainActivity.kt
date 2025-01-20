package com.example.androidapplication

import BaseTimer

object Main {
    @Throws(InterruptedException::class)
    @JvmStatic
    fun main(args: Array<String>) {
        val timer = BaseTimer(10) //

        timer.start()
        Thread.sleep(5000)

        BaseTimer.pause()
        Thread.sleep(2000)

        timer.start()
        Thread.sleep(3000)

        timer.reset(15)
        timer.start()
    }
}
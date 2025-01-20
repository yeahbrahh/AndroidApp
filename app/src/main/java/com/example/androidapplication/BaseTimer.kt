import java.util.Timer
import java.util.TimerTask

class BaseTimer(initialSeconds: Int) {
    var remainingSeconds: Int = 10
        private set

    init {
        this.remainingSeconds = initialSeconds
    }

    fun start() {
        if (isRunning) {
            return
        }
        isRunning = true
        timer = Timer()
        val task: TimerTask = object : TimerTask() {
            override fun run() {
                if (this@BaseTimer.remainingSeconds > 0) {
                    println(this@BaseTimer.remainingSeconds)
                    this@BaseTimer.remainingSeconds--
                } else {
                    timer!!.cancel()
                    isRunning = false
                    println("Done")
                }
            }
        }

        timer!!.schedule(task, 1000, 1000)
    }

    fun reset(newSeconds: Int) {
        pause()
        this.remainingSeconds = newSeconds
        println("Timer Reset")
    }

    companion object {
        private var isRunning = false
        private var timer: Timer? = null

        fun pause() {
            if (isRunning && timer != null) {
                timer!!.cancel()
                isRunning = false
                println("Paused")
            }
        }
    }
}
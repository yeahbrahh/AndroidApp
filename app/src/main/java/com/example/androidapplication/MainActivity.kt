import android.os.Bundle

class MainActivity : ComponentActivity() {
    private var timer: BaseTimer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Initialize and start the timer
        timer = BaseTimer(10)
        timer?.start()

        setContent {
            AndroidApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Gage",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        timer?.stop() // Stop the timer when the activity is destroyed
    }
}
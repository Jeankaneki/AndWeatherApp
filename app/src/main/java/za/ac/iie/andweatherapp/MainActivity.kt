package za.ac.iie.andweatherapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Welcome screen layout

        // Initialize start button from layout
        val startButton: Button = findViewById(R.id.button)

        // Set click listener for start button
        startButton.setOnClickListener {
            // Create intent to start weather display activity
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}


package za.ac.iie.andweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    // Parallel arrays for days and temperatures
    private val days = arrayOf(
        "Monday", "Tuesday", "Wednesday",
        "Thursday", "Friday", "Saturday", "Sunday"
    )
    private val maxTemps = arrayOf(25, 29, 22, 24, 20, 18, 16)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)  // Weather display layout

        // Initialize UI components
        val txtAverage: TextView = findViewById(R.id.textView8)
        val exitButton: Button = findViewById(R.id.button2)

        // Display daily temperatures using while loop
        var i = 0
        while (i < days.size) {
            // Get corresponding day and temperature
            val day = days[i]
            val temp = maxTemps[i]

            // Update TextViews based on day index
            when (i) {
                0 -> {
                    findViewById<TextView>(R.id.textView4).text = day
                    findViewById<TextView>(R.id.textView5).text = "$temp°C"
                }
                1 -> {
                    findViewById<TextView>(R.id.textView6).text = day
                    findViewById<TextView>(R.id.textView7).text = "$temp°C"
                }
                // Add cases for remaining days following the same pattern
                2 -> {
                    findViewById<TextView>(R.id.textView9).text = day
                    findViewById<TextView>(R.id.textView10).text = "$temp°C"
                }
                3 -> {
                    findViewById<TextView>(R.id.textView11).text = day
                    findViewById<TextView>(R.id.textView12).text = "$temp°C"
                }
                4 -> {
                    findViewById<TextView>(R.id.textView13).text = day
                    findViewById<TextView>(R.id.textView14).text = "$temp°C"
                }
                5 -> {
                    findViewById<TextView>(R.id.textView15).text = day
                    findViewById<TextView>(R.id.textView16).text = "$temp°C"
                }
                6 -> {
                    findViewById<TextView>(R.id.textView17).text = day
                    findViewById<TextView>(R.id.textView18).text = "$temp°C"
                }
            }
            i++
        }

        // Calculate average temperature
        var sum = 0
        var j = 0
        while (j < maxTemps.size) {
            sum += maxTemps[j]
            j++
        }
        val average = sum.toDouble() / maxTemps.size
        txtAverage.text = "Average: ${"%.1f".format(average)}°C"

        // Exit button functionality
        exitButton.setOnClickListener {
            finish()  // Close current activity and return to MainActivity
        }
    }
}
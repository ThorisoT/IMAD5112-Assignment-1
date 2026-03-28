package com.example.imad5112_assignment_1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val timeEditText = findViewById<EditText>(R.id.timeEditText)
        val submitButton = findViewById<Button>(R.id.sumbitButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val resetButton = findViewById<Button>(R.id.resetButton)

        submitButton.setOnClickListener {

            val timeInput = timeEditText.text.toString()

            val message = when (timeInput) {

                "Morning" -> "Send a 'Good morning' text to a family member."
                "Mid-Morning" -> "Reach out to a colleague with a quick 'Thank you.'"
                "Afternoon" -> "Share a funny meme or interesting link with a friend."
                "Afternoon Snack Time" -> "Send a quick 'thinking of you' message."
                "Dinner" -> "Call a friend or relative for a 5-minute catch-up."
                "Night" -> "Leave a thoughtful comment on a friend's post."
                else -> "Invalid input. Please enter: Morning, Mid-Morning, Afternoon, Afternoon Snack Time, Dinner or Night"
            }
package com.ismaker.moogpt

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val queryInput = findViewById<EditText>(R.id.queryInput)
        val searchButton = findViewById<Button>(R.id.searchButton)
        val responseOutput = findViewById<TextView>(R.id.responseOutput)

        searchButton.setOnClickListener {
            val userQuery = queryInput.text.toString()
            responseOutput.text = provideMockAnswer(userQuery)
            queryInput.text.clear()
        }
    }

    // Simulated knowledge base
    private fun provideMockAnswer(query: String): String {
        return when {
            "weather" in query.lowercase() -> "The weather is sunny with occasional clouds."
            "news" in query.lowercase() -> "Today's headline is about the international peace talks."
            "sports" in query.lowercase() -> "The local team won their game 3-1 yesterday."
            else -> "Sorry, I don't have information on that topic."
        }
    }
}

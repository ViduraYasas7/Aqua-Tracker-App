package com.example.aquatracker

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button4: Button = findViewById(R.id.button4)

        button4.setOnClickListener {
            val intent = Intent(this, Gender::class.java)
            startActivity(intent)
        }

    }
}

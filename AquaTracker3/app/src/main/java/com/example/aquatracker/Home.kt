package com.example.aquatracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)


        val historyBtn: Button = findViewById(R.id.historyBtn)

        historyBtn.setOnClickListener {
            val intent = Intent(this, History::class.java)
            startActivity(intent)
        }

        val settingsBtn: Button = findViewById(R.id.settingsBtn)

        settingsBtn.setOnClickListener {
            val intent = Intent(this, Settings::class.java)
            startActivity(intent)
        }
    }
}
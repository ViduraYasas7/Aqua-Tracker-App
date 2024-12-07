package com.example.aquatracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Gender() : AppCompatActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_gender)

       val button: Button = findViewById(R.id.button)

       button.setOnClickListener {
           val intent = Intent(this, Weight::class.java)
           startActivity(intent)
       }
   }
}

package com.example.cekin.ui.WelcomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cekin.R

class WelcomePage1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page1)

        val startbtn = findViewById<Button>(R.id.startbtn)
        startbtn.setOnClickListener {
            val intent = Intent(this, WelcomePage2::class.java)
            startActivity(intent)
        }
    }
}
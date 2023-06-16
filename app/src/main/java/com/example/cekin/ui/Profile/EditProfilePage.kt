package com.example.cekin.ui.Profile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cekin.MainActivity
import com.example.cekin.R
import com.example.cekin.ui.WelcomePage.WelcomePage2

class EditProfilePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile_page)
        val savechangebtn = findViewById<Button>(R.id.savechangebtn)
        savechangebtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}
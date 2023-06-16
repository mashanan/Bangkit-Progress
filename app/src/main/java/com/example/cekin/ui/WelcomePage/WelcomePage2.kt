package com.example.cekin.ui.WelcomePage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.cekin.R
import com.example.cekin.ui.WelcomePage.Login.login_page
import com.example.cekin.ui.WelcomePage.SignUp.signup_page

class WelcomePage2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page2)

        val loginbtn = findViewById<Button>(R.id.loginbtn)
        loginbtn.setOnClickListener {
            val intent = Intent(this, login_page::class.java)
            startActivity(intent)
        }

        val signupbtn = findViewById<Button>(R.id.signupbtn)
        signupbtn.setOnClickListener {
            val intent = Intent(this, signup_page::class.java)
            startActivity(intent)
        }
    }
}
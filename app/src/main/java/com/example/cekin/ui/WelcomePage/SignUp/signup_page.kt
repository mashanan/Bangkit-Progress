package com.example.cekin.ui.WelcomePage.SignUp

import RegisterViewModel
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.cekin.MainActivity
import com.example.cekin.R

class signup_page : AppCompatActivity() {
    val viewModel by viewModels<RegisterViewModel> {
        ViewModelProvider.NewInstanceFactory()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_signup_page)


        val signupbtn = findViewById<Button>(R.id.signupbtn)
        signupbtn.setOnClickListener {
            val username = findViewById<EditText>(R.id.username).text.toString()
            val email = findViewById<EditText>(R.id.email).text.toString()
            val password = findViewById<EditText>(R.id.password).text.toString()
            val confirmPassword = findViewById<EditText>(R.id.confirmpassword).text.toString()
            executeRegister(username, email, password, confirmPassword)
        }

    }

    private fun executeRegister(username: String, email: String, password: String, confirmPassword: String) {
        viewModel.register(username, email, password, confirmPassword)
    }
}
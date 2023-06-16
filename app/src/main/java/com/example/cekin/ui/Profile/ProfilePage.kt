package com.example.cekin.ui.Profile

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.cekin.R
import com.example.cekin.databinding.FragmentHomeBinding

class ProfilePage : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    class ProfilePage : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_profile_page)

            val profilebtn = findViewById<Button>(R.id.editprofilebtn)
            profilebtn.setOnClickListener {
                val intent = Intent(this, EditProfilePage::class.java)
                startActivity(intent)
            }
        }
    }
}
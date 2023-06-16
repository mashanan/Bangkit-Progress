package com.example.cekin.ui.Supply.Barang.Barang3

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.cekin.MainActivity
import com.example.cekin.R
import com.example.cekin.ui.Supply.SupplyPage

class DetailBarang3 : AppCompatActivity() {
    private var count = 0
    private lateinit var value: TextView
    private lateinit var sharedPreferences3: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_barang3)
        value = findViewById(R.id.value)

        // Initialize SharedPreferences
        sharedPreferences3 = getSharedPreferences("MyPrefs_Barang3", MODE_PRIVATE)

        // Retrieve the last saved value
        count = sharedPreferences3.getInt("count", 0)
        value.text = count.toString()

        val savevaluebarang3 = findViewById<Button>(R.id.savevaluebarang3)
        savevaluebarang3.setOnClickListener {
            val intent = Intent(this, SupplyPage::class.java)
            startActivity(intent)
        }
    }

    fun increment(v: View) {
        count++
        value.text = count.toString()

        // Save the current value
        saveValue()
    }

    fun decrement(v: View) {
        if (count <= 0)
            count = 0
        else
            count--

        value.text = count.toString()

        // Save the current value
        saveValue()
    }

    private fun saveValue() {
        // Save the current value to SharedPreferences
        val editor = sharedPreferences3.edit()
        editor.putInt("count", count)
        editor.apply()
    }
}
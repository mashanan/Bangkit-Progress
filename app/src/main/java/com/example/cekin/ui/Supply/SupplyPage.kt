package com.example.cekin.ui.Supply

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cekin.R
import android.widget.ArrayAdapter
import android.widget.ListView
import android.content.Intent
import com.example.cekin.ui.Supply.Barang.Barang1.DetailBarang1
import com.example.cekin.ui.Supply.Barang.Barang2.DetailBarang2
import com.example.cekin.ui.Supply.Barang.Barang3.DetailBarang3
import com.example.cekin.ui.Supply.Barang.Barang4.DetailBarang4
import com.example.cekin.ui.Supply.Barang.Barang5.DetailBarang5


class SupplyPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_supply_page)

        val values = arrayOf("hairdryer", "Oven", "Kulkas", "Almari", "Kipas")
        val mListView = findViewById<ListView>(R.id.listView)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, values)
        mListView.adapter = adapter

        mListView.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position).toString()

            if (selectedItem == "hairdryer") {
                val intent = Intent(this@SupplyPage, DetailBarang1::class.java)
                startActivity(intent)
            }
            if (selectedItem == "Oven") {
                val intent = Intent(this@SupplyPage, DetailBarang2::class.java)
                startActivity(intent)
            }
            if (selectedItem == "Kulkas") {
                val intent = Intent(this@SupplyPage, DetailBarang3::class.java)
                startActivity(intent)
            }
            if (selectedItem == "Almari") {
                val intent = Intent(this@SupplyPage, DetailBarang4::class.java)
                startActivity(intent)
            }
            if (selectedItem == "Kipas") {
                val intent = Intent(this@SupplyPage, DetailBarang5::class.java)
                startActivity(intent)
            }
        }
    }
}
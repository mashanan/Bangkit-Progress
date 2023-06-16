package com.example.cekin.ui.Supply

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SupplyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is supply Fragment"
    }
    val text: LiveData<String> = _text
}
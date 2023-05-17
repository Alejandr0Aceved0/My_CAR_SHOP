package com.ingacev.navegaciones.ui.myCars

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyCarsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is MY CARS Fragment"
    }
    val text: LiveData<String> = _text
}
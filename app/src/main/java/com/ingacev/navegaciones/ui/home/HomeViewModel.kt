package com.ingacev.navegaciones.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ingacev.navegaciones.model.VehicleResponse


class HomeViewModel : ViewModel() {
    private val _data = MutableLiveData<VehicleResponse>()

}

package com.ingacev.navegaciones.ui.carsShop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ingacev.navegaciones.api.ApiConnection
import com.ingacev.navegaciones.model.VehicleResponse
import timber.log.Timber

class CarsShopViewModel : ViewModel() {

    private val _data = MutableLiveData<VehicleResponse>()


    private val apiService = ApiConnection()
    private val _vehicleList = MutableLiveData<VehicleResponse>()
    val data: MutableLiveData<VehicleResponse> = _vehicleList

    suspend fun getCars() {
        try {
            val response = apiService.api.getCars()
            if (response.isSuccessful) {
                val body = response.body()
                Timber.d("BODY DE RESPUESTA: $body")

                _vehicleList.value = body!! // Actualiza el valor de la variable LiveData
            } else {
                Timber.d("ERROR EN RESPUESTA")
            }
        } catch (e: Exception) {
            Timber.d("ERROR EN RESPUESTA EXCEPCION: $e")
        }
    }
}
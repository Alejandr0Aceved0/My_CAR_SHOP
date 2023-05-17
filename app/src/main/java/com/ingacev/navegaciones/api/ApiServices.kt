package com.ingacev.navegaciones.api

import com.ingacev.navegaciones.model.VehicleResponse
import retrofit2.Response
import retrofit2.http.GET


interface ApiServices {

    @GET("d8c1c023-5ab7-413c-bbec-a3963ff3eed7")
    suspend fun getCars(): Response<VehicleResponse>
}
package com.ingacev.navegaciones.api

import com.ingacev.navegaciones.model.VehicleResponse
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<VehicleResponse>
}
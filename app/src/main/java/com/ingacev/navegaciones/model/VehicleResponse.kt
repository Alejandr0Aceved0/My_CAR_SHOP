package com.ingacev.navegaciones.model


data class VehicleResponse(
    val vehicles: List<Vehicle>
)


data class Vehicle(
    val brand: String,
    val collection_name: String,
    val combustion_type: String,
    val delet_request: Boolean,
    val favorite: Boolean,
    val image: String,
    val location: VehicleLocation,
    val model: Int,
    val state: String
)


data class VehicleLocation(
    val address: String,
    val latitude: String,
    val longitude: String
)
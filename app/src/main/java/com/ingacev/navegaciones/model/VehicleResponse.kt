package com.ingacev.navegaciones.model

data class VehicleResponse(
    val brand: String,
    val model: Int,
    val delete_request: Boolean,
    val state: String,
    val favorite: Boolean,
    val image: String,
    val location: VehicleLocation,
    val collection_name: String,
    val combustion_type: String
)
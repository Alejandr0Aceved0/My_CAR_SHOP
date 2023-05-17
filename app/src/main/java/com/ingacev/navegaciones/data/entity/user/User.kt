package com.ingacev.navegaciones.data.entity.user

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

class User {
    @Entity(tableName = "users")
    data class User(
        @PrimaryKey val id: Int = 1,
        @ColumnInfo(name = "name") val name: String,
        @ColumnInfo(name = "lastName") val lastName: String,
        @ColumnInfo(name = "email") val email: String,
    )

}
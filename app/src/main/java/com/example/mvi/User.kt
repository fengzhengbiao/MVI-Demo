package com.example.mvi

import com.squareup.moshi.Json

data class User(
    @Json(name = "id")
    val id: Int = 0,
    @Json(name = "first_name")
    val name: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "avator")
    val avator: String = ""
)

package com.example.mvi

import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): Page<User>
}
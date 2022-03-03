package com.example.mvi

class MainRepository(private val apiService: ApiService) {
    suspend fun getUsers() = apiService.getUsers()
}
package com.example.mvi

sealed class MainState {

    object Idle : MainState()
    object Loading : MainState()
    data class Users(val data: Page<User>) : MainState()
    data class Error(val error: String?) : MainState()

}

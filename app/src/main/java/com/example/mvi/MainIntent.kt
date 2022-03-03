package com.example.mvi

sealed class MainIntent {

    object FetchUser : MainIntent()

}
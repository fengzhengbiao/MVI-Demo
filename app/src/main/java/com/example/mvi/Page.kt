package com.example.mvi

data class Page<T>(
    var page: Int,
    var per_page:Int,
    var total: Int,
    var total_pages: Int,
    var data: List<User>
)
package com.example.mvi

import android.util.Log
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "https://reqres.in/api/"

    val TAG = RetrofitBuilder::class.java.simpleName

    private fun getRetrofit(): Retrofit {
        val loggingInterceptor: HttpLoggingInterceptor =
            HttpLoggingInterceptor(object : HttpLoggingInterceptor.Logger {
                override fun log(message: String) {
                    Log.i(TAG, message)
                }

            });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        val client = OkHttpClient.Builder()//okhttp设置部分，此处还可再设置网络参数
            .addInterceptor(loggingInterceptor)
            .build();


        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }


    val apiService: ApiService = getRetrofit().create(ApiService::class.java)

}
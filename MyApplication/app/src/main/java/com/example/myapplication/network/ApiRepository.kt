package com.example.myapplication.network

import android.util.Log
import com.example.myapplication.models.Page
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class ApiRepository {

    suspend fun getPage(pageId: String): Page? = try {
        createApiService().getPage(pageId).page
    } catch (exception: Exception){
        Log.d("ApiRepository", exception.message.toString())
        null
    }

    private fun createApiService() = Retrofit.Builder()
        .baseUrl("https://run.mocky.io")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)
}
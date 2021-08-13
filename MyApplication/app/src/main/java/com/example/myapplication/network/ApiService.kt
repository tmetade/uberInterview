package com.example.myapplication.network

import com.example.myapplication.models.Payload
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/v3/{id}")
    suspend fun getPage(@Path("id") id: String): Payload
}
package com.example.myapplication.models

import com.google.gson.annotations.SerializedName

data class Payload(
    @SerializedName("payload")
    val page: Page
)

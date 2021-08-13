package com.example.myapplication.models

import com.google.gson.annotations.SerializedName

data class Page(
//    @SerializedName("headerImage")
//    val headerImage: ?,

//    @SerializedName("items")
//    val items: List<String>?,

    @SerializedName("title")
    val title: String,

    @SerializedName("subtitle")
    val subtitle: String,

    @SerializedName("buttonText")
    val buttonText: String
)

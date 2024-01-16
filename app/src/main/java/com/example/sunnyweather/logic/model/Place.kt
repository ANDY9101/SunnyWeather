package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

///@SerializedName("xx")是让JSON字段和Kotlin字段之间建立映射关系
data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)
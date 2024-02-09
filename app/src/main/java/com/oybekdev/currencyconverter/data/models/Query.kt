package com.oybekdev.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class Query(
    val amount: Int,
    val from: String,
    val to: String
)
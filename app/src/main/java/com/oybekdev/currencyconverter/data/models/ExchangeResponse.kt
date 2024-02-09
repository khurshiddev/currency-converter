package com.oybekdev.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class ExchangeResponse(
    val info: Info,
    val query: Query,
    val result: Double,
    val success: Boolean
)
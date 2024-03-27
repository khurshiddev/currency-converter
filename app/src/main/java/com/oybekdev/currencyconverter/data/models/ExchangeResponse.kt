package com.oybekdev.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class ExchangeResponse(
    @SerializedName("info")
    val info: Info = Info(),
    @SerializedName("query")
    val query: Query = Query(),
    @SerializedName("result")
    val result: Double = 0.0,
    @SerializedName("success")
    val success: Boolean = false
)
package com.oybekdev.currencyconverter.data.models


import com.google.gson.annotations.SerializedName

data class Query(
    @SerializedName("amount")
    val amount: Int = 0,
    @SerializedName("from")
    val from: String = "",
    @SerializedName("to")
    val to: String = ""
)
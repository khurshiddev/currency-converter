package com.oybekdev.currencyconverter.main

import com.oybekdev.currencyconverter.data.models.ExchangeResponse
import com.oybekdev.currencyconverter.utils.Resource

interface MainRepository {
    suspend fun convertRate(
        from:String,
        to:String,
        amount:String
    ):Resource<ExchangeResponse>
}
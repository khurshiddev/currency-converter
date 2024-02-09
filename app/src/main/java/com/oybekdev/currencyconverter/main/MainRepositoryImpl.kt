package com.oybekdev.currencyconverter.main

import com.oybekdev.currencyconverter.data.ConverterApi
import com.oybekdev.currencyconverter.data.models.ExchangeResponse
import com.oybekdev.currencyconverter.utils.Resource
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(
    private val api:ConverterApi
):MainRepository {
    override suspend fun convertRate(
        from: String,
        to: String,
        amount: String,
    ): Resource<ExchangeResponse> {
        return try {
            val response = api.convertRate(from,to, amount)
            if (response.isSuccessful && response.body() != null){
                Resource.Success(response.body())
            }else{
                Resource.Error(response.message())
            }
        }catch(e:Exception){
            Resource.Error(e.message)
        }
    }
}
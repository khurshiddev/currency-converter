package com.oybekdev.currencyconverter.utils

import com.oybekdev.currencyconverter.data.models.ExchangeResponse

sealed class ConvertEvent{
    data class Success(val result:ExchangeResponse):ConvertEvent()
    data class Error(val errorMessage:String?):ConvertEvent()
    object Loading:ConvertEvent()
    object Empty:ConvertEvent() //defult empty
}

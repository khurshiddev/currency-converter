package com.oybekdev.currencyconverter.di

import com.oybekdev.currencyconverter.data.ConverterApi
import com.oybekdev.currencyconverter.main.MainRepository
import com.oybekdev.currencyconverter.main.MainRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class) //App layerda tursin
object AppModule {

    //retrofit create
    @Singleton
    @Provides
    fun getConverterApi():ConverterApi{
        return Retrofit
            .Builder()
            .baseUrl("https://api.apilayer.com/currency_data/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ConverterApi::class.java)
    }

    @Singleton
    @Provides
    fun getMainRepository(api: ConverterApi):MainRepository = MainRepositoryImpl(api)
}
package com.nurgylesimsapplication.app.model

import retrofit2.http.GET
import retrofit2.http.Query

interface TomorrowApi {
    companion object{
        const val  BASE_URL ="https://api.tomorrow.io/v4/"
        const val KEY ="2wORIvHXf9Ho7csnWcbt19nronOWdBUc"
    }
    @GET("weather/realtime")
    suspend fun getCurrentWeather(
        @Query("location")   location:String,
        @Query("apikey") apikey:String = KEY
                                  ): TomorrowIoResponse

    @GET("weather/realtime")

    suspend fun getWeatherForecast(
    @Query("location")   location:String,
    @Query("fields") fields:String,
    @Query("timesteps") timesteps:String,
    @Query("units") units:String,


    @Query("apikey") apikey:String = KEY
    ){}
}
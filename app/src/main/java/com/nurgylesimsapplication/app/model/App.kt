package com.nurgylesimsapplication.app.model

import android.content.Context
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object App {
lateinit var applicationContext: Context

    val retrofit = Retrofit.Builder()
        .baseUrl(TomorrowApi.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val tomorrowApi = retrofit.create(TomorrowApi::class.java)

    fun init(context:Context){
        applicationContext =context
    }
}
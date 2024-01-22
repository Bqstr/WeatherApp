package com.nurgylesimsapplication.app.WeatherFragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nurgylesimsapplication.app.model.TomorrowIoResponse

class WeatherFragmentViewModel :ViewModel(){
    val response = MutableLiveData<TomorrowIoResponse>()

}
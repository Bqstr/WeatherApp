package com.nurgylesimsapplication.app.WeatherFragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.nurgylesimsapplication.app.model.App
import com.nurgylesimsapplication.app.databinding.FragmentWeatherBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class WeatherFragment : Fragment() {
lateinit var binding:FragmentWeatherBinding
val viewModel by viewModels<WeatherFragmentViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =FragmentWeatherBinding.inflate(layoutInflater)

        binding.imageBrightness.setOnClickListener{
            lifecycleScope.launch(Dispatchers.IO) {
                val res = App.tomorrowApi.getCurrentWeather("toronto")

                viewModel.response.postValue(res)
            }



        }
        viewModel.response.observe(viewLifecycleOwner){
            Log.d("Response_my",it.toString())
        }



        return binding.root

    }


}
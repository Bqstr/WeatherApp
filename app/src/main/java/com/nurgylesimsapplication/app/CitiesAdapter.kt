package com.nurgylesimsapplication.app

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nurgylesimsapplication.app.data_classes.City
import com.nurgylesimsapplication.app.databinding.CityesElementBinding

class CitiesAdapter:RecyclerView.Adapter<CitiesAdapter.MyHolder>() {
    var cities = mutableListOf<City>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CitiesAdapter.MyHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding =CityesElementBinding.inflate(inflater,parent,false)
        return MyHolder(binding)
    }

    override fun onBindViewHolder(holder: CitiesAdapter.MyHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class MyHolder(val binding:CityesElementBinding):RecyclerView.ViewHolder(binding.root){

    }
}
package com.nurgylesimsapplication.app.model

import com.google.gson.annotations.SerializedName

data class TomorrowIoResponse(
    @SerializedName("data")
    val data: WeatherData,

    @SerializedName("location")
    val location: Location
)

data class WeatherData(
    @SerializedName("time")
    val time: String,

    @SerializedName("values")
    val values: WeatherValues
)

data class WeatherValues(
    @SerializedName("cloudBase")
    val cloudBase: Double,

    @SerializedName("cloudCeiling")
    val cloudCeiling: Double?, // It can be null

    @SerializedName("cloudCover")
    val cloudCover: Int,

    @SerializedName("dewPoint")
    val dewPoint: Double,

    @SerializedName("freezingRainIntensity")
    val freezingRainIntensity: Double,

    @SerializedName("humidity")
    val humidity: Int,

    @SerializedName("precipitationProbability")
    val precipitationProbability: Int,

    @SerializedName("pressureSurfaceLevel")
    val pressureSurfaceLevel: Double,

    @SerializedName("rainIntensity")
    val rainIntensity: Double,

    @SerializedName("sleetIntensity")
    val sleetIntensity: Double,

    @SerializedName("snowIntensity")
    val snowIntensity: Double,

    @SerializedName("temperature")
    val temperature: Double,

    @SerializedName("temperatureApparent")
    val temperatureApparent: Double,

    @SerializedName("uvHealthConcern")
    val uvHealthConcern: Int,

    @SerializedName("uvIndex")
    val uvIndex: Int,

    @SerializedName("visibility")
    val visibility: Double,

    @SerializedName("weatherCode")
    val weatherCode: Int,

    @SerializedName("windDirection")
    val windDirection: Double,

    @SerializedName("windGust")
    val windGust: Double,

    @SerializedName("windSpeed")
    val windSpeed: Double
)

data class Location(
    @SerializedName("lat")
    val latitude: Double,

    @SerializedName("lon")
    val longitude: Double,

    @SerializedName("name")
    val name: String,

    @SerializedName("type")
    val type: String
)

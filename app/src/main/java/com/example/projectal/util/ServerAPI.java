package com.example.projectal.util;

import com.example.projectal.model.WeatherRequest;
import com.example.projectal.model.WeatherStory;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServerAPI {

    @GET("weather")
    Call<WeatherRequest> listWeather(@Query("q") String city, @Query("appid") String appkey);

    @GET("forecast")
    Call<WeatherStory> listStory(@Query("q") String city, @Query("appid") String appkey);

    @GET("weather")
    Call<WeatherRequest> listWeatherLat(@Query("lat") String lat, @Query("lon") String lon, @Query("appid") String appkey);
}

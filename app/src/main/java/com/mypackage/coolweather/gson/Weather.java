package com.mypackage.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 何书杰 on 2017/9/23.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public NOW now;
    public  Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}

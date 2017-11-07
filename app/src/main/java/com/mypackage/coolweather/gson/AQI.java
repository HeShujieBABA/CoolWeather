package com.mypackage.coolweather.gson;

/**
 * Created by 何书杰 on 2017/9/23.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

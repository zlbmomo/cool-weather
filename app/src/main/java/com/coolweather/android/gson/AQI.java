package com.coolweather.android.gson;

/**
 * Created by zhangsong on 2017/7/12.
 */

public class AQI {

    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}

package com.example.antiverm.cool_weather.code.moudle;

/**
 * Created by Antiver M on 2016/2/8.
 */
public class City {

    private int id;
    private String cityName;
    private String cityCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getcityName() {
        return cityName;
    }

    public void setcityName(String cityName) {
        this.cityName = cityName;
    }

    public String getcityCode() {
        return cityCode;
    }

    public void setcityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
package com.example.antiverm.cool_weather.code.moudle;

/**
 * Created by Antiver M on 2016/2/8.
 */
public class Country {
    private int id;
    private String countryName;
    private String countryCode;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getcountryName() {
        return countryName;
    }

    public void setcountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getcountryCode() {
        return countryCode;
    }

    public void setcountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}

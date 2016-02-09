package com.example.antiverm.cool_weather.code.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Antiver M on 2016/2/8.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {

    //省份表建表语句
    public static final String CREATE_PROVINCE = "create table Province(" + " id integer primary key autoincrement, " + "province_name text, " + "province_code text)";

    //城市表建表语句
    public static final String CREATE_CITY = "create table City(" + " id integer primary key autoincrement, " + "province_name text, " + "province_code text" + "province_id integer)";

    //乡镇表建表语句
    public static final String CREATE_COUNTRY = "create table Country(" + " id integer primary key autoincrement, " + "country_name text, " + "country_code text," + "city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version){
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTRY);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }
}

package com.example.antiverm.cool_weather.code.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.antiverm.cool_weather.code.moudle.Province;

import java.util.List;

/**
 * Created by Antiver M on 2016/2/8.
 */
public class CoolWeatherDB {

    //数据库名
    public static final String DB_NAME = "cool_weather";

    //数据库版本
    public static final int VERSION = 1;
    private static CoolWeatherDB coolWeatherDB;
    private SQLiteDatabase db;

    //将构造方法私有化
    private CoolWeatherDB(Context context){
        CoolWeatherOpenHelper dbHelper = new CoolWeatherOpenHelper(context, DB_NAME, null, VERSION);
        db = dbHelper.getReadableDatabase();
    }

    //获取CoolWeatherDB的实例
    public synchronized static CoolWeatherDB getInstance(Context context){
        if(coolWeatherDB == null){
            coolWeatherDB =new CoolWeatherDB(context);
        }
        return coolWeatherDB;
    }

    //将Province实例存储到数据库
    public void saveProvince(Province province){
        if(province != null){
            ContentValues values = new ContentValues();
            values.put("province_name", province.getProvinceName());
            values.put("province_code", province.getProvinceCode());
            db.insert("Province", null, values);
        }
    }

    //从数据库读取全国所有省份信息
    public List<Province>
}

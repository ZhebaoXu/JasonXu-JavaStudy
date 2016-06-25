package com.jasonxu.fantype.FanTypeFunction;

import android.util.Log;

import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t_xuz on 6/25/16.
 */
public class FanFunction {

    public static <T> void setValue(T value){
        Log.v("value==",value+"");
    }

    public <T>void setValue2(T value2){
        Log.v("value2==",value2+"");
    }

    public <U> List<U> getData(String name,U u){

        List<U> dataList = new ArrayList<>();
        return dataList;
    }


    public static List<xuliehua> parseArray(String response){
//        List<xuliehua> modelList = JSON.parseArray(response, xuliehua.class);
//        return modelList;
        return null;
    }
    public <T> List<T> parseArray(String response,Class<T> object){
//        List<T> parseList = JSON.parseArray(response,object);
//        return parseList;
        return null;
    }
}

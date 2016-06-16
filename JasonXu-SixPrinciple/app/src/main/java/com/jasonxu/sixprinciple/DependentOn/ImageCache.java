package com.jasonxu.sixprinciple.DependentOn;

import android.graphics.Bitmap;

/**
 * Created by t_xuz on 6/9/16.
 * //所有缓存方式的父接口
 */
public interface ImageCache {

    public Bitmap get(String url);

    public void put(String url,Bitmap bmp);
}

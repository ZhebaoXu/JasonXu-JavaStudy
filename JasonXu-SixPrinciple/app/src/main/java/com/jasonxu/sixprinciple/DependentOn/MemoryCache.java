package com.jasonxu.sixprinciple.DependentOn;

import android.graphics.Bitmap;

/**
 * Created by t_xuz on 6/9/16.
 */
public class MemoryCache implements ImageCache{

    @Override
    public void put(String url, Bitmap bmp) {

    }

    @Override
    public Bitmap get(String url) {
        return null;
    }
}

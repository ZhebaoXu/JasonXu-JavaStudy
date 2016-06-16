package com.jasonxu.sixprinciple.DependentOn;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by t_xuz on 6/9/16.
 * 使用依赖倒置原则的ImageLoader
 */
public class ImageLoaderFinal {

    //图片缓存类,依赖于抽象,并且给了一个默认的实现
    ImageCache mCache = new MemoryCache();

    public void displayImage(String url, ImageView imageView){

        Bitmap bmp = mCache.get(url);
        if (bmp == null){
            //异步加载图片
//            downloadImageAsync(url,imageView);
        }else {
            imageView.setImageBitmap(bmp);
        }
    }

    //设置缓存策略,形参依赖于抽象
    public void setImageCache(ImageCache mCache){
        this.mCache = mCache;
    }

}

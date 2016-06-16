package com.jasonxu.sixprinciple.DependentOn;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Created by t_xuz on 6/9/16.
 * //依赖倒置原则:
 * 模块间的依赖通过抽象发生,实现类之间不直接发生依赖关系,其依赖关系是通过接口或抽象类产生的.
 * 如果类与类之间直接依赖于细节,那么它们之间就有了直接的耦合,当具体实现发生变化时,意味着要同时修改依赖着的代码,这就限制了系统的可扩展性
 */
public class ImageLoader2 {

    //内存缓存,这个是直接依赖于细节的
    DoubleCache mDoubleCache = new DoubleCache();

    public void displayImage(String url, ImageView imageView){
//        Bitmap bmp = mMemoryCache.get(url);
        Bitmap bmp = null;
        if (bmp == null){
            //downloadImage(url,imageView);
        }
    }

    //这里的形参也直接依赖于细节了
    public void setImageCache(DoubleCache cache){
        mDoubleCache = cache;
    }

    //....
}

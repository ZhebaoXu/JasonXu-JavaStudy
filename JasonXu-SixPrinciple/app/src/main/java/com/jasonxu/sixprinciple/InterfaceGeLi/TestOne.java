package com.jasonxu.sixprinciple.InterfaceGeLi;

import android.graphics.Bitmap;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by t_xuz on 6/9/16.
 */
public class TestOne {

    public void put(String url, Bitmap bitmap){
        FileOutputStream fileOutputStream = null;
        try{
            fileOutputStream = new FileOutputStream("cacheDir"+url);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally{
            if (fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

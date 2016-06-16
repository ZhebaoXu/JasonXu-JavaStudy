package com.jasonxu.sixprinciple.InterfaceGeLi;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by t_xuz on 6/9/16.
 */
public class CloseUtils {

    private CloseUtils(){}

    /*
    * 关闭Closeable对象
    * */
    public static void closeQuietly(Closeable closeable){
        if (null != closeable){
            try{
                closeable.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}

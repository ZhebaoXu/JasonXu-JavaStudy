package com.jasonxu.fantype.FanTypeClass;

/**
 * Created by t_xuz on 6/25/16.
 * 泛型类:
 * 类名后面加上<>,里面指定类型
 */
public class Point<T> {

    private T x;
    private T y;

    public Point(){}

    public Point(T x,T y){
        this.x = x;
        this.y = y;
    }

    public void setX(T x){
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getY() {
        return y;
    }
}

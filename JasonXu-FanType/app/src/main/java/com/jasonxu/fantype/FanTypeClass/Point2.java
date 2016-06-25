package com.jasonxu.fantype.FanTypeClass;

/**
 * Created by t_xuz on 6/25/16.
 */
public class Point2<T,V> {
    private T x;
    private V y;

    public Point2(){}

    public Point2(T x,V y){
        this.x = x;
        this.y = y;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public void setY(V y) {
        this.y = y;
    }

    public V getY() {
        return y;
    }
}

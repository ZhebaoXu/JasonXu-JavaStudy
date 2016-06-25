package com.jasonxu.fantype.FanTypeInterface;

/**
 * Created by t_xuz on 6/25/16.
 */
public class InfoHaImpl<T,V,W,X> implements InfoHa<T,V> {

    private T t;
    private V v;
    private W w;
    private X x;

    public InfoHaImpl(W w,X x){
        this.w = w;
        this.x = x;
    }

    @Override
    public T getHa() {
        return t;
    }

    @Override
    public void setHa(T ha) {
        this.t = ha;
    }

    @Override
    public V getMei() {
        return v;
    }

    @Override
    public void setMei(V mei) {
        this.v = mei;
    }

    public void setW(W w) {
        this.w = w;
    }

    public W getW() {
        return w;
    }

    public void setX(X x) {
        this.x = x;
    }

    public X getX() {
        return x;
    }

    @Override
    public String toString() {
        return "InfoHaImpl{" +
                "t=" + t +
                ", v=" + v +
                ", w=" + w +
                ", x=" + x +
                '}';
    }
}

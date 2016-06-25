package com.jasonxu.fantype.FanTypeInterface;

/**
 * Created by t_xuz on 6/25/16.
 *
 */
public class InfoImpl<T> implements Info<T> {
    private T info;

    @Override
    public void setInfo(T info) {
        this.info = info;
    }

    @Override
    public T getInfo() {
        return info;
    }
}

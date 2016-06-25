package com.jasonxu.fantype.FanTypeFunction;


/**
 * Created by t_xuz on 6/25/16.
 *
 */
public class TestFunction {

    public static void main(String[] args) {


        //static method
        FanFunction.setValue(12);
        FanFunction.<Integer>setValue(24);

        //common method
        FanFunction mFanFunction = new FanFunction();
        mFanFunction.setValue2("haha");
        mFanFunction.<String>setValue2("nihaha");
    }
}

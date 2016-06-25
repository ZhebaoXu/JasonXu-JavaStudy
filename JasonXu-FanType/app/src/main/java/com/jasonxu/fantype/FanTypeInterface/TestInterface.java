package com.jasonxu.fantype.FanTypeInterface;

/**
 * Created by t_xuz on 6/25/16.
 */
public class TestInterface {

    public static void main(String[] args) {

        Info<String> mInfo = new InfoImpl<>();
        mInfo.setInfo("nimeidawo");
        System.out.println("info-impl = "+mInfo.getInfo());

        //------
        InfoHa<Integer,String> mInfoHa = new InfoHaImpl<>(12,13);
        mInfoHa.setHa(1233);
        mInfoHa.setMei("haha");
        System.out.println("mInfoHa = "+ mInfoHa.toString());

    }
}

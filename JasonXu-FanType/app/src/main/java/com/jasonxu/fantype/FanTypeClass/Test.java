package com.jasonxu.fantype.FanTypeClass;

/**
 * Created by t_xuz on 6/25/16.
 */
public class Test {

    public static void main(String[] args) {
        Point<String> p = new Point<>();
        p.setX("123");
        p.setY("234");

        System.out.println("point -- X = " + p.getX());
        System.out.println("point -- Y = " + p.getY());

        //---------
        Point2<Integer, String> p1 = new Point2<>(123, "678你妹");
        System.out.println("point2 -- x = " + p1.getX());
        System.out.println("point2 -- y = " + p1.getY());

    }
}

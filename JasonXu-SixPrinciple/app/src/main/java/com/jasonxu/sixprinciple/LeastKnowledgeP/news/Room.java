package com.jasonxu.sixprinciple.LeastKnowledgeP.news;

/**
 * Created by t_xuz on 6/9/16.
 * //房间
 */
public class Room {
    public float area;
    public float price;
    public Room(float area,float price){
        this.area = area;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "area=" + area +
                ", price=" + price +
                '}';
    }
}

package com.jasonxu.sixprinciple.LeastKnowledgeP.news;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by t_xuz on 6/9/16.
 * 中介
 */
public class Mediator {
    List<Room> mRooms = new ArrayList<Room>();

    public Mediator() {
        for (int i = 0; i < 5; i++) {
            mRooms.add(new Room(14 + i, (15 + i) * 100));
        }
    }

    public Room rentOut(float area, float price) {
        for (Room room : mRooms) {
            if (isSuitable(area, price, room)) {
                return room;
            }
        }
        return null;
    }

    private boolean isSuitable(float area, float price, Room room) {
        return Math.abs(room.price - price) < Tenant.diffPrice
                && Math.abs(room.area - area) < Tenant.diffArea;
    }
}

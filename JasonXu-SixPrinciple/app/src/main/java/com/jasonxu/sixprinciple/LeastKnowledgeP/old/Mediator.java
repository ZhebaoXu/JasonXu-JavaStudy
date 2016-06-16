package com.jasonxu.sixprinciple.LeastKnowledgeP.old;

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

    public List<Room> getAllRooms(){
        return mRooms;
    }
}

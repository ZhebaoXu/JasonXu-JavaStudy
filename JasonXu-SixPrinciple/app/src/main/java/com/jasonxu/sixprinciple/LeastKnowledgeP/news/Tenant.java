package com.jasonxu.sixprinciple.LeastKnowledgeP.news;

import java.util.List;

/**
 * Created by t_xuz on 6/9/16.
 * 租户
 * 说明:该类不仅依赖于Mediator,而且还依赖于Room类,很明显该类做的事情太多,把中介该干的一些事都干了,从而导致该类与ROom类
 * 耦合度过高,要中介就不需要知道Room这么多细节东西
 * 原则:只能与直接朋友通信
 */
public class Tenant {

    public float roomArea;
    public float roomPrice;
    public static final float diffPrice = 100.00f;
    public static final float diffArea = 0.0004f;

    public void rentRoom(Mediator mediator) {
        System.out.print("租到房子啦啦1" + mediator.rentOut(roomArea, roomPrice));
    }


}

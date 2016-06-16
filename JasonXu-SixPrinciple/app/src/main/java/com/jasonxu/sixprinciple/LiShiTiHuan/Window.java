package com.jasonxu.sixprinciple.LiShiTiHuan;

/**
 * Created by t_xuz on 6/9/16.
 * //里氏替换原则核心原理是抽象,而抽象又依赖于继承
 * 通俗理解是:父类出现的地方,子类就可以出现,并且可以替换;而子类出现的地方,父类未必适应
 */
public class Window {

    //Window依赖于View,而View定义了一个视图抽象,子类复写父类的draw方法实现具体细节.这里任何View的子类都可以替换View
    public void show(View child){
        child.draw();
    }

}

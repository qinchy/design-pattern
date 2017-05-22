package com.design.my.observerModelImprove;


import com.design.my.observerModelImprove.observer.IStar;

import com.design.my.observerModelImprove.observer.imp.Assistant;
import com.design.my.observerModelImprove.observer.imp.Star;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Main {

    public static void main(String [] args) {
        System.out.println();
        System.out.println("<-------------没有开启观察者模式！--------------->");

        IStar huge = new Star("胡歌");
        huge.act();
        huge.haveFun();
        huge.haveBreakfast();

        System.out.println();
        System.out.println("<-------------开启观察者模式！--------------->");

        huge = new Assistant(huge);
        huge.act();
        huge.haveFun();
        huge.haveBreakfast();

//        System.out.println();
//        System.out.println("<-------------开启观察者模式！--------------->");
//        huge = (IStar) Proxy.newProxyInstance(huge.getClass().getClassLoader(),huge.getClass().getInterfaces(),new com.design.my.observerModelImprove.proxy.Assistant(huge));
//        huge.getName();
//        huge.act();
//        huge.haveFun();
//        huge.haveBreakfast();
    }
}

package com.design.my.observerModelImprove.observer;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public interface IObserver {

    //观察者接受消息后的操作
    public void handle(String context);
}

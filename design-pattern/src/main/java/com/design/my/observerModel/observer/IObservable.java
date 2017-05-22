package com.design.my.observerModel.observer;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public interface IObservable {

    //被观察者添加观察者
    public void addObservable(IObserver observer);

    //被观察者移除观察者
    public void deleteObserver(IObserver observer);

    //被观察者告知观察者
    public void notifyObservers(String context);
}

package com.design.my.observerModelImprove.observer.imp;

import com.design.my.observerModelImprove.observer.IObservable;
import com.design.my.observerModelImprove.observer.IObserver;
import com.design.my.observerModelImprove.observer.IStar;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Assistant implements IStar, IObservable{

    private Logger logger = Logger.getLogger(this.getClass());

    List<IObserver> observers = new ArrayList<>();

    private IStar star;

    {
        //定义记者
        IObserver li = new JournalistLI();
        IObserver liu = new JournalistLiu();
        IObserver wang = new JournalistWang();

        //添加观察者
        addObservable(li);
        addObservable(liu);
        addObservable(wang);
    }

    public Assistant(IStar star) {
        this.star = star;
    }

    @Override
    public void act() {
        star.act();
        notifyObservers(getName()+"正在拍摄电影！");
    }

    @Override
    public void haveFun() {
        star.haveFun();
        notifyObservers(getName()+"正在KTV唱歌！");
    }

    @Override
    public void haveBreakfast() {
        star.haveBreakfast();
        notifyObservers(getName()+"正在汉丽轩吃自助！");
    }

    @Override
    public String getName() {
        return star.getName();
    }

    @Override
    public void addObservable(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(IObserver observer : observers){
            observer.handle(context);
        }
    }

}

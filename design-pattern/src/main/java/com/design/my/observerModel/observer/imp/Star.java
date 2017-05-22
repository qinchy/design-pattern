package com.design.my.observerModel.observer.imp;

import com.design.my.observerModel.observer.IObservable;
import com.design.my.observerModel.observer.IObserver;
import com.design.my.observerModel.observer.IStar;
import org.apache.log4j.Logger;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Star implements IStar, IObservable{
    private Logger logger = Logger.getLogger(this.getClass());

    List<IObserver>  observers = new ArrayList<>();

    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void act() {
        logger.info(getName() + "： 我在拍摄电影！");
        notifyObservers(getName() + "正在拍摄电影！");
    }

    @Override
    public void haveFun() {
        logger.info(getName() + "： 我在KTV唱歌！");
        notifyObservers(getName() + "正在KTV唱歌！");
    }

    @Override
    public void haveBreakfast() {
        logger.info(getName() + "： 我在汉丽轩吃自助！");
        notifyObservers(getName() + "正在汉丽轩吃自助！");
    }

    @Override
    public String getName() {
        return name;
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
            try {
                observer.handle(context);
            }catch (Exception e){
                logger.error(observer+"观察者处理报错",e);
            }
        }
    }
}

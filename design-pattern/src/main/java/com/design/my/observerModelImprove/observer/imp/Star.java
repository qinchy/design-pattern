package com.design.my.observerModelImprove.observer.imp;

import com.design.my.observerModelImprove.observer.IStar;
import org.apache.log4j.Logger;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Star implements IStar{
    private Logger logger = Logger.getLogger(this.getClass());
    private String name;

    public Star(String name) {
        this.name = name;
    }

    @Override
    public void act() {
        logger.info(name + "： 我在拍摄电影！");
    }

    @Override
    public void haveFun() {
        logger.info(name + "： 我在KTV唱歌！");
    }

    @Override
    public void haveBreakfast() {
        logger.info(name +  "： 我在汉丽轩吃自助！");
    }

    @Override
    public String getName() {
        return name;
    }
}

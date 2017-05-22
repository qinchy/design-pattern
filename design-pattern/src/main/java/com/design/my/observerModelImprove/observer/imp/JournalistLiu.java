package com.design.my.observerModelImprove.observer.imp;

import com.design.my.observerModelImprove.observer.IObserver;
import org.apache.log4j.Logger;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class JournalistLiu implements IObserver {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void handle(String context) {
        logger.info("电视 ------ 刘记者独家报道： "+ context );
    }
}

package com.design.my.observerModelImprove.observer.imp;

import com.design.my.observerModelImprove.observer.IObserver;
import org.apache.log4j.Logger;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class JournalistLI implements IObserver{
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void handle(String context) {
        logger.info("报纸 ------ 李记者独家报道： "+ context );
    }
}

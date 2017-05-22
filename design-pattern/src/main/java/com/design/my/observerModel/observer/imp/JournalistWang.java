package com.design.my.observerModel.observer.imp;

import com.design.my.observerModel.observer.IObserver;
import org.apache.log4j.Logger;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class JournalistWang implements IObserver {
    private Logger logger = Logger.getLogger(this.getClass());

    @Override
    public void handle(String context) {
        logger.info("优酷 ------ 王记者独家报道： "+ context );
    }
}

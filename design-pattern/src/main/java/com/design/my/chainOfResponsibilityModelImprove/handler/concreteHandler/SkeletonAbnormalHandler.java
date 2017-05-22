package com.design.my.chainOfResponsibilityModelImprove.handler.concreteHandler;

import com.design.my.chainOfResponsibilityModel.entry.Data;
import com.design.my.chainOfResponsibilityModelImprove.entry.Request;
import com.design.my.chainOfResponsibilityModelImprove.handler.AbstractHandler;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public abstract class SkeletonAbnormalHandler extends AbstractHandler<Request<Data>>{
    /**
     * 业务逻辑1
     * */
    protected void method1(){
        logger.info("业务逻辑1！");
    }

    /**
     * 业务逻辑2
     * */
    protected void method2(){
        logger.info("业务逻辑2！");
    }

    /**
     * 业务逻辑3
     * */
    protected void method3(){
        logger.info("业务逻辑3！");
    }
}

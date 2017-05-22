package com.design.my.chainOfResponsibilityModelImprove.handler.concreteHandler;

import com.design.my.chainOfResponsibilityModel.entry.Data;
import com.design.my.chainOfResponsibilityModel.entry.Level;
import com.design.my.chainOfResponsibilityModelImprove.entry.Request;
import com.design.my.chainOfResponsibilityModelImprove.entry.Response;
import com.design.my.chainOfResponsibilityModelImprove.handler.IHandler;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class ConcreteHandler2 extends SkeletonAbnormalHandler  implements IHandler<Request<Data>>{
    private Level level = new Level(2);

    @Override
    protected boolean isPermitted(Request request) {
        return level.equals(request.getLevel());
    }

    @Override
    protected Response echo(Request<Data> request) {
        method1();
        method2();
        method3();
        Data date = request.getDate();
        logger.info("ConcreteHandler2 处理完请求");
        return new Response();
    }
}

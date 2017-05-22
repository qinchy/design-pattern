package com.design.my.chainOfResponsibilityModel.handler.concreteHandler;

import com.design.my.chainOfResponsibilityModel.entry.Level;
import com.design.my.chainOfResponsibilityModel.entry.Request;
import com.design.my.chainOfResponsibilityModel.entry.Response;
import com.design.my.chainOfResponsibilityModel.handler.Handler;

/**
 * Created by kuo.sun on 2017/3/28.
 */
public class ConcreteHandler2 extends Handler {
    private Level level = new Level(2);

    @Override
    protected Level getHandlerLevel() {
        return level;
    }

    @Override
    protected Response echo(Request request) {
        logger.info("ConcreteHandler2 处理完请求");
        return new Response();
    }
}

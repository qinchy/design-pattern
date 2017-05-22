package com.design.my.chainOfResponsibilityModelImprove.handler;

import com.design.my.chainOfResponsibilityModelImprove.entry.Response;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public interface IHandler<T> {

    void setNextHandler(IHandler nextHandler);

    Response handlerMessage(T request);
}

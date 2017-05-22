package com.design.my.chainOfResponsibilityModelImprove.entrance;

import com.design.my.chainOfResponsibilityModelImprove.entry.Request;
import com.design.my.chainOfResponsibilityModelImprove.entry.Response;
import com.design.my.chainOfResponsibilityModelImprove.handler.IHandler;
import com.design.my.chainOfResponsibilityModelImprove.handler.concreteHandler.ConcreteHandler1;
import com.design.my.chainOfResponsibilityModelImprove.handler.concreteHandler.ConcreteHandler2;
import com.design.my.chainOfResponsibilityModelImprove.handler.concreteHandler.ConcreteHandler3;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Entrace implements IEntrance{
    @Override
    public Response handle(Request request) {
        //声明所有的处理节点
        IHandler handler1 = new ConcreteHandler1();
        IHandler handler2 = new ConcreteHandler2();
        IHandler handler3 = new ConcreteHandler3();

        //设置链中的阶段顺序1-->2-->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        return handler1.handlerMessage(request);
    }
}

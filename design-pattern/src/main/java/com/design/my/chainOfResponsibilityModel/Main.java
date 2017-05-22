package com.design.my.chainOfResponsibilityModel;

import com.design.my.chainOfResponsibilityModel.entry.Data;
import com.design.my.chainOfResponsibilityModel.entry.Level;
import com.design.my.chainOfResponsibilityModel.entry.Request;
import com.design.my.chainOfResponsibilityModel.handler.concreteHandler.ConcreteHandler1;
import com.design.my.chainOfResponsibilityModel.handler.concreteHandler.ConcreteHandler2;
import com.design.my.chainOfResponsibilityModel.handler.concreteHandler.ConcreteHandler3;
import com.design.my.chainOfResponsibilityModel.handler.Handler;

/**
 * Created by kuo.sun on 2017/3/28.
 */
public class Main {
    public static void main(String [] args){
        //声明所有的处理节点
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        //设置链中的阶段顺序1-->2-->3
        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        //提交请求，返回结果
        System.out.println();
        System.out.println("<------------------------------将处理等级设置1-------------------------------------->");
        Request request = new Request(new Level(1), new Data());
        handler1.handlerMessage(request);

        System.out.println();
        System.out.println("<------------------------------将处理等级设置2-------------------------------------->");
        request = new Request(new Level(2), new Data());
        handler1.handlerMessage(request);

        System.out.println();
        System.out.println("<------------------------------将处理等级设置3-------------------------------------->");
        request = new Request(new Level(3), new Data());
        handler1.handlerMessage(request);

        System.out.println();
        System.out.println("<------------------------------将处理等级设置4-------------------------------------->");
        request = new Request(new Level(4), new Data());
        handler1.handlerMessage(request);
    }
}

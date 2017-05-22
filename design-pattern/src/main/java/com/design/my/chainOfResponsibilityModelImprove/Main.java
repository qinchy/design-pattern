package com.design.my.chainOfResponsibilityModelImprove;


import com.design.my.chainOfResponsibilityModelImprove.entry.Data;
import com.design.my.chainOfResponsibilityModelImprove.entry.Level;
import com.design.my.chainOfResponsibilityModelImprove.entrance.Entrace;
import com.design.my.chainOfResponsibilityModelImprove.entrance.IEntrance;
import com.design.my.chainOfResponsibilityModelImprove.entry.Request;

/**
 * Created by kuo.sun on 2017/3/28.
 */
public class Main {
    private  static  IEntrance entrance = new Entrace();

    public static void main(String [] args) {

        //提交请求，返回结果
        System.out.println();
        System.out.println("<------------------------------将处理等级设置1-------------------------------------->");
        dosoming(1,new Data());

        System.out.println();
        System.out.println("<------------------------------将处理等级设置2-------------------------------------->");
        dosoming(2,new Data());

        System.out.println();
        System.out.println("<------------------------------将处理等级设置3-------------------------------------->");
        dosoming(3, new Data());
    }

    private static void  dosoming(Integer i , Data data){

        Request<Data> request = new Request<>(new Level(i), new Data());

        entrance.handle(request);
    }
}

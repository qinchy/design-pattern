package com.design.my.observerModel;


import com.design.my.observerModel.observer.IObserver;
import com.design.my.observerModel.observer.imp.JournalistLI;
import com.design.my.observerModel.observer.imp.JournalistLiu;
import com.design.my.observerModel.observer.imp.JournalistWang;
import com.design.my.observerModel.observer.imp.Star;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public class Main {

    public static void main(String [] args){
        //定义明星
        Star huge = new Star("胡歌");

        //定义记者
        IObserver li = new JournalistLI();
        IObserver liu = new JournalistLiu();
        IObserver wang = new JournalistWang();

        //添加观察者
        huge.addObservable(li);
        huge.addObservable(liu);
        huge.addObservable(wang);

        //某一天，三位记者都在观察
        System.out.println("<-------------------------某一天，三位记者都在观察----------------------------->");
        huge.act();
        huge.haveFun();
        huge.haveBreakfast();

        //某一天,刘记者有事请假
        System.out.println();
        System.out.println("<-------------------------某一天，刘记者有事请假,李记者、王记者继续观察----------------------------->");
        huge.deleteObserver(liu);
        huge.act();
        huge.haveFun();
        huge.haveBreakfast();

        //某一天,李记者、王记者有事请假，刘记者回来了
        System.out.println();
        System.out.println("<-------------------------某一天,李记者、王记者有事请假，刘记者回来了----------------------------->");
        huge.deleteObserver(li);
        huge.deleteObserver(wang);
        huge.addObservable(liu);
        huge.act();
        huge.haveFun();
        huge.haveBreakfast();
    }
}

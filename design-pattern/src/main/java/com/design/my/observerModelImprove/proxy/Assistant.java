package com.design.my.observerModelImprove.proxy;

import com.design.my.observerModel.observer.IObservable;
import com.design.my.observerModel.observer.IObserver;
import com.design.my.observerModel.observer.imp.JournalistLI;
import com.design.my.observerModel.observer.imp.JournalistLiu;
import com.design.my.observerModel.observer.imp.JournalistWang;
import org.apache.log4j.Logger;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kuo.sun on 2017/5/11.
 */
public class Assistant  implements InvocationHandler, IObservable{

    private Logger logger = Logger.getLogger(this.getClass());

    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    public Assistant(Object obj) {
        this.obj = obj;
    }

    private String name;

    List<IObserver> observers = new ArrayList<>();

    {
        //定义记者
        IObserver li = new JournalistLI();
        IObserver liu = new JournalistLiu();
        IObserver wang = new JournalistWang();

        //添加观察者
        addObservable(li);
        addObservable(liu);
        addObservable(wang);

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);

        String context = creteContext(method.getName(), result);
        if(context != null){
            notifyObservers(context);
        }

        return result;
    }

    @Override
    public void addObservable(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void deleteObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for(IObserver observer : observers){
            observer.handle(context);
        }
    }

    private String creteContext(String methodName, Object result){
        String context = null;
        if("act".equals(methodName)){
            context = name + "正在拍摄电影!";
        }else if("haveFun".equals(methodName)){
            context = name + "正在KTV唱歌!";
        }else if("haveBreakfast".equals(methodName)){
            context = name + "正在汉丽轩吃自助！";
        }else if("getName".equals(methodName)){
            this.name = result.toString();
        }
        return context;
    }
}

package com.design.my.chainOfResponsibilityModelImprove.handler;

import com.design.my.chainOfResponsibilityModelImprove.entry.Response;
import org.apache.log4j.Logger;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public abstract class AbstractHandler<T> {
    protected Logger logger = Logger.getLogger(this.getClass());

    private IHandler nextHandler;

    public final Response handlerMessage(T request){
        Response response = null;
        if(isPermitted(request)){
            logger.debug(this.getClass().getSimpleName()+"在处理请求......");

            //属于本处理者，本处理者处理
            response = this.echo(request);
        }else{
            //不属于本处理者，查看是否存在关联的下一个处理者，存在移交关联的下一个处理者
            if(this.nextHandler != null){
                logger.debug(this.getClass().getSimpleName()+"不能处理请求，转交给" + nextHandler.getClass().getSimpleName() +"处理......");

                response = this.nextHandler.handlerMessage(request);
            }else {
                //如果不存在处理者处理...
                logger.debug(this.getClass().getSimpleName()+"不能处理请求，责任链结束......");
            }
        }
        return response;
    }

    /**
     * 设置下一个处理者
     * */
    public void setNextHandler(IHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 获取是否是当前处理者处理权限
     * */
    protected  abstract  boolean  isPermitted(T request);

    /**
     *每个处理者都要实现处理的业务
     * */
    protected abstract Response echo(T request);
}

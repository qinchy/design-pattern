package com.design.my.chainOfResponsibilityModel.handler;

import com.design.my.chainOfResponsibilityModel.entry.Level;
import com.design.my.chainOfResponsibilityModel.entry.Request;
import com.design.my.chainOfResponsibilityModel.entry.Response;
import org.apache.log4j.Logger;

public abstract class Handler {
    protected Logger logger = Logger.getLogger(this.getClass());
    /**
     *关联的下一个处理者
     * */
    private Handler nextHandler;

    public final Response handlerMessage(Request request){
        Response response = null;
        if(this.getHandlerLevel().equals(request.getLevel())){

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
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     *获取每个处理者的一个处理等级
     * */
    protected abstract Level getHandlerLevel();

    /**
     *每个处理者都要实现处理的业务
     * */
    protected abstract Response echo(Request request);
}

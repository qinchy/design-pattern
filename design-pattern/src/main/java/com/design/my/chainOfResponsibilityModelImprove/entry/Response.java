package com.design.my.chainOfResponsibilityModelImprove.entry;

public class Response<T> {
    /**
     * 用来接收处理类处理的相应信息
     * */
    private T response;

    public T getResponse() {
        return response;
    }

    public void setResponse(T response) {
        this.response = response;
    }
}

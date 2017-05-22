package com.design.my.chainOfResponsibilityModelImprove.entrance;

import com.design.my.chainOfResponsibilityModelImprove.entry.Request;
import com.design.my.chainOfResponsibilityModelImprove.entry.Response;

/**
 * Created by kuo.sun on 2017/5/10.
 */
public interface IEntrance {
    public Response handle(Request request);
}

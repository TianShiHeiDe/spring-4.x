package com.zhaolu.study.spring4.chapter2.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2017/11/13.
 * 自定义事件类
 */
public class DemoEvent extends ApplicationEvent {

    private static final long serialVersionUID = -3899333463677416602L;

    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

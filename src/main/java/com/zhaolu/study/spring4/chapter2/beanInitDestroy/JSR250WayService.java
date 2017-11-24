package com.zhaolu.study.spring4.chapter2.beanInitDestroy;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2017/11/13.
 */
public class JSR250WayService {


    @PostConstruct
    public void init() {
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("JSR250-destroy-method");
    }
}

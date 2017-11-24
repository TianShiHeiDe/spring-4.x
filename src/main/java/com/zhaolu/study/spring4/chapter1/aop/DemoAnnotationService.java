package com.zhaolu.study.spring4.chapter1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/2.
 */
@Service
public class DemoAnnotationService {

    @Action(name="注解式拦截的add操作")
    public void add() {

    }
}

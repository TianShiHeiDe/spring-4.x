package com.zhaolu.study.spring4.chapter3.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/11/13.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AwareConfig.class);
        context.refresh();

        AwareService bean = context.getBean(AwareService.class);
        bean.outputResult();

        context.close();
    }
}

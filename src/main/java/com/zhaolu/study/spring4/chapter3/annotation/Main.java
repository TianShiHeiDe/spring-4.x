package com.zhaolu.study.spring4.chapter3.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/11/14.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

        DemoService bean = context.getBean(DemoService.class);

        bean.outputResult();

        context.close();
    }
}

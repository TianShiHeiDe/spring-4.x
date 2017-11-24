package com.zhaolu.study.spring4.chapter2.beanInitDestroy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/11/13.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.register(PrePostConfig.class);
        context.refresh();

        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService bean = context.getBean(JSR250WayService.class);

        context.close();
    }
}

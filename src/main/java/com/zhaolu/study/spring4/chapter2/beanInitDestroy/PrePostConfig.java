package com.zhaolu.study.spring4.chapter2.beanInitDestroy;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Administrator on 2017/11/13.
 */
@Configurable
@ComponentScan("com.zhaolu.study.spring4.chapter2.beanInitDestroy")
public class PrePostConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}

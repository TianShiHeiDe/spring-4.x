package com.zhaolu.study.spring4.chapter2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/11/13.
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//在这里切换参数来达到使用不同环境的目的
        context.getEnvironment().setActiveProfiles("dev");
        //这里将java配置类后置，否则会出现未找到bean异常
        context.register(ProfileConfig.class);

        context.refresh();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}

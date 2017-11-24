package com.zhaolu.study.spring4.demo;

import com.zhaolu.study.spring4.demo.config.DiConfig;
import com.zhaolu.study.spring4.demo.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2017/10/30.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);

        UseFunctionService service = context.getBean(UseFunctionService.class);

        System.out.println(service.sayHello("helloword"));

        context.close();

    }
}

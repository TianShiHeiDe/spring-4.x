package com.zhaolu.study.spring4.chapter3.annotation;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class DemoService {

    public void outputResult() {
        System.out.println("从组合注解配置照样获得Bean");
    }
}

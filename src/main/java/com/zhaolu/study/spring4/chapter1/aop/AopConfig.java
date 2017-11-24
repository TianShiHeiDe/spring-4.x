package com.zhaolu.study.spring4.chapter1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Administrator on 2017/11/2.
 */
@Configuration
@ComponentScan("com.zhaolu.study.spring4.chapter1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}

package com.zhaolu.study.spring4.chapter3.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.*;

/**
 * 1.组合@Configuration元注解
 * 2.组合@ComponentScan元注解
 * 3.覆盖value参数
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration //1
@ComponentScan //2
public @interface ZhaoConfiguration {

    String[] value() default {}; //3
}

package com.zhaolu.study.spring4.chapter1.aop;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/11/2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}

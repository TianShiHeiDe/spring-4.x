package com.zhaolu.study.spring4.chapter3.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Administrator on 2017/11/14.
 */
public class WindowsCondition implements Condition {


    /**
     * 判断当前操作系统是否是win
     * @param context
     * @param metadata
     * @return if true ，represent current OS is Windows，whether is false.
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}

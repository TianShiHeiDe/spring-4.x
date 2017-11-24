package com.zhaolu.study.spring4.chapter1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/11/2.
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.zhaolu.study.spring4.chapter1.aop.Action)")
    public void annotationPointCut() {
        System.out.println("我是切入点的内容");
    }

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截器 "+action.name());
    }

    /**
     * 第一个*表示返回值，*表示返回值为任意类型
     * 后面这个就是典型的包名路径，其中可以包含 * 来进行通配，几个 * 没区别。
     * 这里可以通过&&、||、!来进行条件组合
     * ()代表这个方法的参数
     * (..)这样来代表任意类型、任意个数的参数。
     * @param joinPoint
     */
    @Before("execution(* com.zhaolu.study.spring4.chapter1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截器 "+method.getName());
    }

    @Around("execution(* com.zhaolu.study.spring4.chapter1.aop.DemoMethodService.add())")
    public void onAddAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String key = proceedingJoinPoint.getSignature().toString();
        System.out.println(key);
        proceedingJoinPoint.proceed();
        System.out.println(key);
    }
}

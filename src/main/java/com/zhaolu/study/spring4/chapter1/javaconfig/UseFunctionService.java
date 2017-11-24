package com.zhaolu.study.spring4.chapter1.javaconfig;

/**
 * Created by Administrator on 2017/11/2.
 */
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}

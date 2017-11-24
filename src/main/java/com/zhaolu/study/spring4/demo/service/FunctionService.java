package com.zhaolu.study.spring4.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/10/30.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}

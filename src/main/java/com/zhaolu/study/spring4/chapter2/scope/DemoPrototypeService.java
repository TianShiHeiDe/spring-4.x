package com.zhaolu.study.spring4.chapter2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/2.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}

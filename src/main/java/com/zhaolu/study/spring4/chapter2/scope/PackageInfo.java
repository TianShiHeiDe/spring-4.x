package com.zhaolu.study.spring4.chapter2.scope;

/**
 * Created by Administrator on 2017/11/13.
 */
public class PackageInfo {

    /*
        本章主要讲解spring中bean示例的作用域

        1.singleton 全局只有一个，默认配置
        2.prototype 每次调用方法都会创建一个新的对象
        3.request 对于每次http request请求创建一个新的对象
        4.session 对于每个http session创建一个新的对象
        5.globalSession 在portal应用中使用，给每个global http session创建一个对象
        6.stepScope 在batch中使用。详见batch章节
     */
}

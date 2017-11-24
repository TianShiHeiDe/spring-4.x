package com.zhaolu.study.spring4.chapter2.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/11/13.
 * 自定义监听器
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Override
    public void onApplicationEvent(DemoEvent event) {
        String msg = event.getMsg();
        System.out.println("我（bean-demoListener）接收到了bean-demoPublisher发布的消息："+msg);
        String name = event.getSource().getClass().getName();
        System.out.println(name);
    }
}

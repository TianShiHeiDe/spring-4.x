package com.zhaolu.study.spring4.chapter3.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/11/13.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer integer) {
        System.out.println("执行异步任务："+integer);
    }

    @Async
    public void executeAsyncTaskPlus(Integer integer) {
        System.out.println("执行异步任务："+(integer+1));
    }
}

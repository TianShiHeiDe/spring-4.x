package com.zhaolu.study.spring4.chapter3.taskscheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/11/14.
 */
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("每隔五秒执行一次 "+DATE_FORMAT.format(new Date()));
    }

    @Scheduled(cron = "40 6 10 ? * *")
    public void fixTimeExecution(){
        System.out.println("在指定时间 "+ DATE_FORMAT.format(new Date())+"执行");
    }
}

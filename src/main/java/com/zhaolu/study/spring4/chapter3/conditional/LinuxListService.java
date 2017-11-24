package com.zhaolu.study.spring4.chapter3.conditional;

/**
 * Created by Administrator on 2017/11/14.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}

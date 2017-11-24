package com.zhaolu.study.spring4.chapter3.conditional;

/**
 * Created by Administrator on 2017/11/14.
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}

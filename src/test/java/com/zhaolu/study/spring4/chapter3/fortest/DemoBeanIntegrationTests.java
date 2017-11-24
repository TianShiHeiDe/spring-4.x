package com.zhaolu.study.spring4.chapter3.fortest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Administrator on 2017/11/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)//在junit环境下提供spring framework test的支持
@ContextConfiguration(classes = {TestConfig.class}) //用来加载配置文件，即生成容器上下文。
@ActiveProfiles("dev") //声明活动的profile文件
public class DemoBeanIntegrationTests {

    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject() {

        String expected = "from production profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected,actual);
    }
}

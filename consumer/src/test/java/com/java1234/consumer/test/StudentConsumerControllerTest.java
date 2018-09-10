package com.java1234.consumer.test;

import com.alibaba.fastjson.JSON;
import com.java1234.ConsumerApplication;
import com.java1234.controller.StudentConsumerController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsumerApplication.class)
public class StudentConsumerControllerTest {
    @Autowired
    private StudentConsumerController studentConsumerController;

    @Test
    public  void test(){
        System.out.println("--^^^--"+ JSON.toJSONString(studentConsumerController.list()));
    }
}

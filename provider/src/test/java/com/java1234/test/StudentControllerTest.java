package com.java1234.test;

import com.alibaba.fastjson.JSON;
import com.java1234.ProviderApplication;
import com.java1234.controller.StudentProviderController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class StudentControllerTest {
    @Autowired
    private StudentProviderController studentProviderController;

    @Test
    public void test(){
        System.out.println(JSON.toJSONString(studentProviderController.list()));
    }
}

package com.java1234.hystrix;

import com.google.common.collect.Lists;
import com.java1234.bean.FaceLibrary;
import com.java1234.client.StudentClient;
import org.springframework.stereotype.Component;
import java.util.List;
@Component
public class StudentClientFallback implements StudentClient {
    @Override
    public List<FaceLibrary> list() {
        System.out.println("------student fall back-------------");
        return Lists.newArrayList();
    }
}

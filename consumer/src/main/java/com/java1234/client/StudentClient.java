package com.java1234.client;

import com.java1234.domain.Student;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient("student-provider")
public interface StudentClient {

    @RequestMapping("/student/list")
    List<Student> list();
}

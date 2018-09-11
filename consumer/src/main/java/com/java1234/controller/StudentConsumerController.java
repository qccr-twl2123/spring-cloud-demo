package com.java1234.controller;
import com.java1234.bean.FaceLibrary;
import com.java1234.client.StudentClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentConsumerController {
	@Autowired
	private StudentClient studentClient;

	@GetMapping(value="/list")
    public List<FaceLibrary> list(){
        System.out.println("----------consumer---------");
        return studentClient.list();
    }
     

}

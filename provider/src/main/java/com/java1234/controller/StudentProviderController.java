package com.java1234.controller;
 
import java.util.List;
import com.java1234.common.entity.FaceLibrary;
import com.java1234.service.FaceLibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentProviderController {
    @Autowired
    private FaceLibraryService faceLibraryService;

    @GetMapping(value="/list")
    public List<FaceLibrary> list(){
        System.out.println("----------provider---------");
        return faceLibraryService.queryForList("");
    }
     

}
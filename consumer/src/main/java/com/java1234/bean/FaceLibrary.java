package com.java1234.bean;

import lombok.Data;

import java.util.Date;
@Data
public class FaceLibrary {

    private Long id;

    private String name;

    private Integer age;

    private Integer gender;

    private String rect;

    private String path;

    private String createPerson;

    private Date createTime;

    private String updatePerson;

    private Date updateTime;

    private byte[] feature;
}

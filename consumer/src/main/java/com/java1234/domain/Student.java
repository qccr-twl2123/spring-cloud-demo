package com.java1234.domain;

import java.io.Serializable;

/**
 * 学生信息实体
 * @author Administrator
 *
 */

public class Student implements Serializable{
    private static final long serialVersionUID = 1L;
    private Integer id; // 编号
    private String name; // 姓名
    private String grade; // 年级
     
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

}
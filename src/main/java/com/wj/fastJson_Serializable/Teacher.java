package com.wj.fastJson_Serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 2016/12/14 0014.
 */
public class Teacher implements Serializable{

    private Integer id;
    private String name;
    private Integer age;
    private List<Student> studentList;

    public Teacher(){
        studentList=new ArrayList<Student>();
    }

    public Teacher(Integer id,String name,Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
        studentList=new ArrayList<Student>();
    }

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}

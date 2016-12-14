package com.wj.fastJson_Serializable;

import java.io.Serializable;

/**
 * Created by wangjie on 2016/12/14 0014.
 *
 * 一个JSON库涉及的最基本功能就是序列化和反序列化。Fastjson支持java bean的直接序列化。
 * 使用com.alibaba.fastjson.JSON这个类进行序列化和反序列化。
 */
public class Student implements Serializable{

    private Integer id;
    private String name;
    private Integer age;
    private Integer grade;   //对于alibaba提供的JSON中间件的要求，首字符小写，第二个字母不能大写，后面按照驼峰命名就可以。

    public Student(){}
    public Student(Integer id,String name,Integer age,Integer grade){
        this.id=id;
        this.name=name;
        this.age=age;
        this.grade=grade;
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

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}

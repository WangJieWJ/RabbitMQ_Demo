package com.wj.netJson_Serializable;

import java.io.Serializable;

/**
 * Created by wangjie on 2016/12/14 0014.
 *
 * 使用net.sf.json-lib这个类进行序列化和反序列化。
 */
public class Student implements Serializable{

    private Integer id;
    private String name;
    private Integer age;

    public Student(){}
    public Student(Integer id,String name,Integer age){
        this.id=id;
        this.name=name;
        this.age=age;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.wj.netJson_Serializable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangjie on 2016/12/14 0014.
 */
public class Teacher implements Serializable{

    private Integer tId;
    private String tName;
    private Integer tAge;    //net.sf.json包，对于实体类中字段的命名没有什么要求。
    private List<Student> studentList;

    public Teacher(){
        studentList=new ArrayList<Student>();
    }

    public Teacher(Integer id,String name,Integer age){
        this.tId=id;
        this.tName=name;
        this.tAge=age;
        studentList=new ArrayList<Student>();
    }

    public Integer gettId() {
        return tId;
    }

    public void settId(Integer tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public Integer gettAge() {
        return tAge;
    }

    public void settAge(Integer tAge) {
        this.tAge = tAge;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tId=" + tId +
                ", tName='" + tName + '\'' +
                ", tAge=" + tAge +
                ", studentList=" + studentList +
                '}';
    }
}

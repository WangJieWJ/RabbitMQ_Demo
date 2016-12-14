package com.wj.fastJson_Serializable;

import com.alibaba.fastjson.JSON;

/**
 * Created by wangjie on 2016/12/14 0014.
 */
public class Test {

    public static void main(String[] args){

        Student student1=new Student(1306010203,"WJ",21,89);
        Student student2=new Student(1306010202,"MCC",20,65);
        Student student3=new Student(1306010204,"WM",22,35);

        Teacher teacher=new Teacher(51035,"SJW",35);
        teacher.getStudentList().add(student1);
        teacher.getStudentList().add(student2);
        teacher.getStudentList().add(student3);

        String Json_Stu= JSON.toJSONString(student1);
        System.out.println(Json_Stu);
        Student student=JSON.parseObject(Json_Stu,Student.class);
        System.out.println("学生的Id："+student.getId()+"学生的name："+student.getName()+"学生的age："+student.getAge());
        String Json_Tea=JSON.toJSONString(teacher);
        Teacher teacher1=JSON.parseObject(Json_Tea,Teacher.class);
        System.out.println("教师的Id："+teacher1.getId()+"教师的name："+teacher1.getName()+"教师的age："+teacher1.getAge()+"学生："+teacher1.getStudentList());

    }
}

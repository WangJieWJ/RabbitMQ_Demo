package com.wj.netJson_Serializable;

import net.sf.json.JSONObject;

/**
 * Created by wangjie on 2016/12/14 0014.
 */
public class Test {

    public static void main(String[] args){
        Student student1=new Student(135646,"WWW",26);
        JSONObject jsonObject=JSONObject.fromObject(student1);
        String JSON_Stu=jsonObject.toString();
        System.out.println(JSON_Stu);

        JSONObject jsonObject1=JSONObject.fromObject(JSON_Stu);
        Student student=(Student) JSONObject.toBean(jsonObject1,Student.class);
        System.out.println(student);

        Teacher teacher=new Teacher(123,"asd",48);
        teacher.getStudentList().add(student1);
        JSONObject jsonObject2=JSONObject.fromObject(teacher);
        String JSON_Tea=jsonObject2.toString();
        System.out.println(JSON_Tea);

        JSONObject jsonObject3=JSONObject.fromObject(JSON_Tea);
        Teacher teacher1=(Teacher) JSONObject.toBean(jsonObject3,Teacher.class);
        System.out.println(teacher1);
    }
}

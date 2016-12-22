package com.wj.byte_Serializable;

/**
 * Created by wangjie on 2016/12/22 0022.
 */
public class Test {

    public static void main(String[] args){
        Customer customer=new Customer(1306010203,"WangJie",23);
        System.out.println(customer.getId()+"--"+customer.getName()+"--"+customer.getAge());
        byte[] ser=SerializableUtil.Serialize(customer);
        Customer customer1= (Customer) SerializableUtil.deSerialize(ser);
        System.out.println(customer1.getId()+"**"+customer1.getName()+"**"+customer1.getAge());
    }
}

package com.wj.rabbitmqDemo;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;

/**
 * Created by wangjie on 2016/12/11 0011.
 */
public class Producer_1 {

    //队列名称
    private final static String QUEUE_NAME="hello";

    public static void main(String[] args) throws IOException{
        /**
         * 创建连接 连接到RabbitMQ
         */
        ConnectionFactory factory=new ConnectionFactory();
        //设置RabbitMQ所在的主机ip或者主机名
        factory.setHost("192.168.1.129");
        factory.setUsername("WangJie");
        factory.setVirtualHost("/");
        factory.setPassword("wangjie123");

        //创建一个连接
        Connection connection=factory.newConnection();
        //创建一个频道
        Channel channel=connection.createChannel();
        //制定一个队列
        channel.queueDeclare(QUEUE_NAME,false,false,false,null);
        //发送的消息
        String message="hello world";
        //往队列中发出一条消息
        channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
        System.out.println("[X] Sent '"+message+"'");
        //关闭频道和连接
        channel.close();
        connection.close();
    }
}

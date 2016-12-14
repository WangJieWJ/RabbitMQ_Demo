package com.wj.rabbitmqDemo2;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.MessageProperties;

import java.io.IOException;

/**
 * Created by wangjie on 2016/12/12 0012.
 */
public class NewTask {

    //队列名称
    private final static String QUEUE_TASK_NAME="Task3";

    public static void main(String[] args) throws IOException {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection=factory.newConnection();
        Channel channel=connection.createChannel();

        boolean durable=true; // 消息持久化
        channel.queueDeclare(QUEUE_TASK_NAME,durable,false,false,null);
        for(int i=0;i<10;i++){
            String docs="";
            for(int j=0;j<i;j++){
                docs+=".";
            }
            String messages="hello world "+docs+docs.length();
            //第三个参数设置消息持久化的操作
            channel.basicPublish("",QUEUE_TASK_NAME, MessageProperties.PERSISTENT_TEXT_PLAIN,messages.getBytes());
            System.out.println("[x] sent '"+messages+"'");
        }
        channel.close();
        connection.close();
    }
}

package com.wj.rabbitmqDemo2;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;

import java.io.IOException;

/**
 * Created by wangjie on 2016/12/12 0012.
 */
public class Work {

    //队列名称
    private final static String QUEUE_TASK_NAME="Task1";

    public static void main(String[] args) throws IOException, InterruptedException {
        //区分不同工作进程的输出
        int hashCode=Work.class.hashCode();
        //创建连接和频道
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("localhost");
        Connection connection=factory.newConnection();
        Channel channel=connection.createChannel();
        //声明队列
        boolean durable=true; //消息持久化
        channel.queueDeclare(QUEUE_TASK_NAME,durable,false,false,null);
        System.out.println(hashCode+"[*] Waiting for messages. To exit press CTPL+C");
        QueueingConsumer consumer=new QueueingConsumer(channel);
        //设置最大服务转发消息数量
        int prefetchCount=1; //公平转发
        channel.basicQos(prefetchCount);
        //指定消费队列
        boolean ack=false;//打开消息应答机制
        channel.basicConsume(QUEUE_TASK_NAME,ack,consumer);
        while(true){
            QueueingConsumer.Delivery delivery=consumer.nextDelivery();
            String message=new String(delivery.getBody());

            System.out.println(hashCode + "[X] Received '"+message+"'");
            dowork(message);
            System.out.println(hashCode + "[X] Done");
            //消息确认
            channel.basicAck(delivery.getEnvelope().getDeliveryTag(),false);
        }
    }

    public static void dowork(String task) throws InterruptedException {
        for(char ch : task.toCharArray()){
            if(ch == '.'){
                Thread.sleep(1000);
            }
        }
    }

}

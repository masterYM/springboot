package com.dl.springboot.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @RabbitListener：当对应的队列中有消息的时候，该注解修饰下的方法会被执行。
 * @RabbitHandler：接收者可以监听多个队列，不同的队列消息的类型可能不同，该注解可以使得不同的消息让不同方法来响应。
 */
//@Component
//@RabbitListener(queues = "hello")
//public class HelloReceiver {
//
//    @RabbitHandler
//    public void process(String hello) {
//        System.out.println("Receiver  : " + hello);
//    }
//
//}

@Component
public class HelloReceiver {

    @RabbitListener(queues = "hello")
    public void receive(String hello) {
        System.out.println("Receiver  : " + hello);
    }

}

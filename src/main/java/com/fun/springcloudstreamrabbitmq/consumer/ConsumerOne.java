package com.fun.springcloudstreamrabbitmq.consumer;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Configuration
public class ConsumerOne {


    @Bean
    public Consumer<Message<String>> ss007AutoConsumer() {
        return msg -> {
            System.out.println("收到一条消息");
            System.out.println(msg);
        };
    }

//    @Bean
//    public Consumer<String> ss007AutoConsumer(){
//        return new Consumer<String>() {
//            @Override
//            public void accept(String msgData) {
//                System.out.println("ss007AutoConsumer接到消息："+msgData.toString());
//            }
//        };
//    }


}

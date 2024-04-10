package com.fun.springcloudstreamrabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.function.Supplier;

@RestController
@RequestMapping("/send")
public class ProducerOne {
    @Autowired
    private StreamBridge bridge;

    @PostMapping("/test")
    public void send(String bingdingName,String data){
        bridge.send(bingdingName,data);
        System.out.println("测试消息已发送");
    }

    @Bean
    public Supplier<Message<String>> ss007AutoProducer() {
        return new Supplier<Message<String>>() {
            @Override
            public Message<String> get() {
                return MessageBuilder.withPayload("收到一条测试消息007")
                        .build();
            }
        };
    }
}

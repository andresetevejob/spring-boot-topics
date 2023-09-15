package com.andre.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumerListener {
    @KafkaListener(id = "essai", topics = "demo")
    public void listen(String in) throws InterruptedException {
        System.out.println(in);
        //throw new RuntimeException("error");
        Thread.sleep(6000);
    }

}

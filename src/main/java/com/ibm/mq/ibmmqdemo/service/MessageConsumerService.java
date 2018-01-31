package com.ibm.mq.ibmmqdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumerService {

    public static final String DESTINATION_QUEUE = "TEST123";

    @JmsListener(destination = DESTINATION_QUEUE)
    public void receive(String message){
        System.out.println(message);
    }
}

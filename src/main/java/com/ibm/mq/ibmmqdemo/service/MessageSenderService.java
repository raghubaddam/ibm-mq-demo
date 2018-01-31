package com.ibm.mq.ibmmqdemo.service;


import com.ibm.mq.ibmmqdemo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsOperations;
import org.springframework.stereotype.Service;

@Service
public class MessageSenderService {

    @Autowired
    private JmsOperations jmsOperations;

    @Value(("${project.mq.queue1}"))
    private String queueName;

    public void send(User user){
        jmsOperations.convertAndSend(queueName, user.getName());
    }
}

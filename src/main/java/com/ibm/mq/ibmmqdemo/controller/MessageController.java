package com.ibm.mq.ibmmqdemo.controller;

import com.ibm.mq.ibmmqdemo.domain.User;
import com.ibm.mq.ibmmqdemo.service.MessageSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageSenderService messageSender;

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    public String send(@RequestBody User user){
        messageSender.send(user);

        return "Sent";
    }
}

package com.example.spring.procucer.service;

import com.example.spring.procucer.dto.MessageQueue;

public interface AmqpService {
    void sendToConsumer(MessageQueue message);
}
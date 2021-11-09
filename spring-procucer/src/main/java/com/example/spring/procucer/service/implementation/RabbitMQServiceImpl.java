package com.example.spring.procucer.service.implementation;

import com.example.spring.procucer.amqp.AmqpProducer;
import com.example.spring.procucer.dto.MessageQueue;
import com.example.spring.procucer.service.AmqpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQServiceImpl implements AmqpService {

    @Autowired
    private AmqpProducer<MessageQueue> amqp;

    @Override
    public void sendToConsumer(MessageQueue message) {
        amqp.producer(message);
    }
}
package com.example.spring.consumer.service.implementation;

import com.example.spring.consumer.dto.MessageQueue;
import com.example.spring.consumer.service.ConsumerService;
import org.springframework.amqp.AmqpRejectAndDontRequeueException;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    public static final String TESTE = "teste";
    public static final String ERRO = "erro";

    @Override
    public void action(MessageQueue message) {
        if(TESTE.equalsIgnoreCase(message.getText())) {
            throw new AmqpRejectAndDontRequeueException(ERRO);
        }

        System.out.println(message.getText());
    }
}
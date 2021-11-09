package com.example.spring.procucer.amqp;

public interface AmqpProducer<T> {
    void producer(T t);
}
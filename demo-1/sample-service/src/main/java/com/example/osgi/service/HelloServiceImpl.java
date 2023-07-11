package com.example.osgi.service;

import com.example.osgi.consumer.contracts.HelloService;

public class HelloServiceImpl implements HelloService {
    @Override
    public void sayHello(String name) {
        System.out.println(">>>> Hello " + name + " from HelloServiceImpl...!!!");
    }
}

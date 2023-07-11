package com.example.osgi.service;


import com.example.osgi.consumer.contracts.HelloService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(
        service = HelloService.class,
        immediate = true
)
public class HelloServiceImpl implements HelloService {

    @Activate
    protected void activate(ComponentContext context) {
        System.out.println(">>>> HelloServiceImpl activated!");
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        System.out.println(">>>> HelloServiceImpl deactivated!");
    }

    @Override
    public void sayHello(String name) {
        System.out.println(">>>> Hello " + name + " from HelloServiceImpl...!!!");
    }
}

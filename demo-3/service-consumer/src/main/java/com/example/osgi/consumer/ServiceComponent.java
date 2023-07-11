package com.example.osgi.consumer;

import com.example.osgi.consumer.contracts.HelloService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.*;

@Component(
        immediate = true
)
public class ServiceComponent {

    @Activate
    protected void activate(ComponentContext context) {
        System.out.println(">>>> service-consumer.ServiceComponent activated!");
    }

    @Deactivate
    protected void deactivate(ComponentContext context) {
        System.out.println(">>>> service-consumer.ServiceComponent deactivated!");
    }

    @Reference(
            service = HelloService.class,
            policy = ReferencePolicy.DYNAMIC,
            cardinality = ReferenceCardinality.MANDATORY,
            unbind = "unbindHelloService"
    )
    protected void bindHelloService(HelloService helloService) {
        System.out.println(">>>> service-consumer.ServiceComponent.bindHelloService called!");
        helloService.sayHello("Consumer");
    }

    protected void unbindHelloService(HelloService helloService) {
        System.out.println(">>>> service-consumer.ServiceComponent.unbindHelloService called!");
    }
}

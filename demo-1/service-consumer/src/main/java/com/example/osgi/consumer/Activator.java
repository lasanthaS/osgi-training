package com.example.osgi.consumer;

import com.example.osgi.consumer.contracts.HelloService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'service-consumer' started!");

        ServiceReference serviceReference = bundleContext.getServiceReference(HelloService.class.getName());
        HelloService helloService = null;

        if (serviceReference != null) {
            helloService = (HelloService) bundleContext.getService(serviceReference);
        } else {
            System.out.println(">>>> Service reference is null!");
        }

        if (helloService != null) {
            helloService.sayHello("OSGi Service Consumer");
        } else {
            System.out.println(">>>> HelloService is null!");
        }
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'service-consumer' stopped!");
    }
}

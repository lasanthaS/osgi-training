package com.example.osgi.service;

import com.example.osgi.consumer.contracts.HelloService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class Activator implements BundleActivator {
    ServiceRegistration serviceRegistration;

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' started!");

        // Register the service implementation in the OSGi service registry
        HelloService helloService = new HelloServiceImpl();
        serviceRegistration = bundleContext.registerService(HelloService.class.getName(), helloService, null);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' stopped!");

        // Unregister the service implementation from the OSGi service registry
        serviceRegistration.unregister();
    }
}

package com.example.osgi.consumer;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'service-consumer' started!");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'service-consumer' stopped!");
    }
}

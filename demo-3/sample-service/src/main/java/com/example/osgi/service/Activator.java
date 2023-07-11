package com.example.osgi.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' started!");
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' stopped!");
    }
}

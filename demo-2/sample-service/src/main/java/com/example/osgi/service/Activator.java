package com.example.osgi.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceEvent;
import org.osgi.framework.ServiceListener;

public class Activator implements BundleActivator, ServiceListener {

    @Override
    public void start(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' started!");
        bundleContext.addServiceListener(this);
    }

    @Override
    public void stop(BundleContext bundleContext) throws Exception {
        System.out.println(">>>> OSGi bundle 'sample-service' stopped!");
        bundleContext.removeServiceListener(this);
    }

    @Override
    public void serviceChanged(ServiceEvent serviceEvent) {
        switch (serviceEvent.getType()) {
            case ServiceEvent.REGISTERED:
                System.out.println(">>>> OSGi service '" + serviceEvent.getServiceReference().getBundle().getSymbolicName() + "' " +
                        "registered!");
                break;
            case ServiceEvent.UNREGISTERING:
                System.out.println(">>>> OSGi service '" + serviceEvent.getServiceReference().getBundle().getSymbolicName() + "' " +
                        "unregistered!");
                break;
            case ServiceEvent.MODIFIED:
                System.out.println(">>>> OSGi service '" + serviceEvent.getServiceReference().getBundle().getSymbolicName() + "' " +
                        "modified!");
                break;
            default:
                break;
        }
    }
}

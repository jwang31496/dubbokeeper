package com.dubboclub.monitor.model;

/**
 * Created by bieber on 2015/11/7.
 */
public class ServiceInfo {
    private String name;

    private String remoteType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemoteType() {
        return remoteType;
    }

    public void setRemoteType(String remoteType) {
        this.remoteType = remoteType;
    }
}

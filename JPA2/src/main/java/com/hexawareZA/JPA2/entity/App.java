package com.hexawareZA.JPA2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "App")
public class App {

    @Column(name = "App_Name")
    private String appName;

    @ManyToOne
    private Mobile mobile;

    public App() {
    }

    public App(String appName) {
        this.appName = appName;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "App{" +
                "appName='" + appName +
                '}';
    }
}

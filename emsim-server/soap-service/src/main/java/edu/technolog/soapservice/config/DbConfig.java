/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.technolog.soapservice.config;

/**
 *
 * @author Администратор
 */

public class DbConfig {
    private String driverClassName;
    private String url;
    private String user;

    public DbConfig(String driverClassName, String url, String user) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.user = user;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "driverClassName='" + driverClassName + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                '}';
    }
}    

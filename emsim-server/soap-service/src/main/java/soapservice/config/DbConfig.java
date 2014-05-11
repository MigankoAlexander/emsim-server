/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soapservice.config;

import soapservice.config.Configuration;

/**
 *
 * @author Администратор
 */

public class DbConfig {
  public String getDriverClassName() {
        return Configuration.get("db.driverClassName");
    }

    public String getUrl() {
        return Configuration.get("db.url");
    }

    public String getUser() {
        return Configuration.get("db.user");
    }

    public String getPassword() {
        return Configuration.get("db.password");
    }

    public boolean isSchemaMigrationRequired() {
        return Boolean.parseBoolean(Configuration.get("db.migrate"));
    }

    @Override
    public String toString() {
        return "DbConfig{" +
                "driverClassName='" + getDriverClassName() + '\'' +
                ", url='" + getUrl() + '\'' +
                ", user='" + getUser() + '\'' +
                '}';
    }
}    

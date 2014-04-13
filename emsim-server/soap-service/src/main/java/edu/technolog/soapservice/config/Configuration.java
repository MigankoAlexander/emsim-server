/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.technolog.soapservice.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.lang.invoke.MethodHandles;
import java.util.Properties;
/**
 *
 * @author Администратор
 */

    public final class Configuration {
    private static final Logger log = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    public static final DbConfig DB;
    

    static {
        try {
            Properties config = new Properties();
            config.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));

            DB = new DbConfig(config.getProperty("db.driverClassName"),
                    config.getProperty("db.url"), config.getProperty("db.user"));
            
        } catch (IOException e) {
            log.error("loading config failed", e);
            throw new RuntimeException("loading config failed", e);
        }
    }
    private Configuration() {
    }
}

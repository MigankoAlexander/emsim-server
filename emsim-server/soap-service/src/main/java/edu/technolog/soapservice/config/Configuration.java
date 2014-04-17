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

    private static final Properties config = new Properties();

    public static final DbConfig DB = new DbConfig();

    static {
        try {
            config.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            log.error("loading config failed", e);
            throw new RuntimeException("loading config failed", e);
        }
    }

    public static String get(String key) {
        String res = System.getProperty(key);
        return (res != null) ? res : config.getProperty(key);
    }


    private Configuration() {
    }
}

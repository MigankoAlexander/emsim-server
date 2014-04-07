package edu.technolog.db;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import liquibase.Liquibase;
import liquibase.database.jvm.JdbcConnection;
import liquibase.exception.LiquibaseException;
import liquibase.resource.ClassLoaderResourceAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Администратор
 */
public class SchemaMigrator {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final String driverClassName;
    private final String url;
    private final String user;
    private final String password;

    private static final String CHANGE_LOG = "liquibase/db.changelog.main.xml";

    public SchemaMigrator(String driverClassName, String url, String user, String password) {
        this.driverClassName = driverClassName;
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void migrate() throws ClassNotFoundException, SQLException, LiquibaseException {
        logger.info("Migrating the database " + url + " ... ");
        //setup h2 schema
        Class.forName(driverClassName);
        Connection holdingConnection = DriverManager.getConnection(url, user, password);
        JdbcConnection jdbcconn = new JdbcConnection(holdingConnection);
        Liquibase liquibase = new Liquibase(CHANGE_LOG, new ClassLoaderResourceAccessor(), jdbcconn);
        liquibase.dropAll();
        liquibase.update("");
        jdbcconn.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.technolog.soapservice.publish;

import edu.technolog.soapservice.impl.RequestProcessServiceImpl;
import javax.xml.ws.Endpoint;

/**
 *
 * @author Администратор
 */
public class WebServicePublisher {

    public static void main(String[] args) {

        Endpoint.publish("http://localhost:8080/RequestProcessWeb/requestprocess", new RequestProcessServiceImpl());

        System.out.println("The web service is published at http://localhost:8080/RequestProcessWeb/requestprocess");

        System.out.println("To stop running the web service , terminate the java process");

    }
}

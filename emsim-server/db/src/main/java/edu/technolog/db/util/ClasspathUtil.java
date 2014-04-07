package edu.technolog.db.util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Администратор
 */
public class ClasspathUtil {
    public static String getFilePath(String fileName) {
        return Thread.currentThread().getContextClassLoader().getResource(fileName).getPath();
    }
}

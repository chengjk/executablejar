package com.jk.exejar.depsres;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * created by jacky. 2020/2/7 10:41 AM
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("application.properties"));

        System.out.println("run with dependency and resources");
        System.out.println(properties.get("config.name"));
    }
}

package com.jk.test.excutablejar;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * created by jacky. 2019/4/25 10:44 AM
 */
public class WithRes {


    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("application.properties"));
        System.out.println(properties.getProperty("name"));

        System.out.println("run with resource");

    }

}

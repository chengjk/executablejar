package com.jk.test.excutablejar;

import com.alibaba.fastjson.JSON;
import com.jk.test.excutablejar.model.User;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * created by jacky. 2019/4/25 10:44 AM
 */
public class WithDepRes {


    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("application.properties"));
        User user = new User();
        user.setName(properties.getProperty("name"));
        user.setAge(100);
        System.out.println(JSON.toJSONString(user));
        System.out.println("run with dependency and resources");
    }

}

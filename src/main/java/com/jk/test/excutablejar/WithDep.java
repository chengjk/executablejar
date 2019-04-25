package com.jk.test.excutablejar;

import com.alibaba.fastjson.JSON;
import com.jk.test.excutablejar.model.User;

/**
 * created by jacky. 2019/4/25 10:44 AM
 */
public class WithDep {


    public static void main(String[] args) {
        User user = new User();
        user.setName("test");
        user.setAge(100);
        System.out.println(JSON.toJSONString(user));
        System.out.println("run with dependency");
    }

}

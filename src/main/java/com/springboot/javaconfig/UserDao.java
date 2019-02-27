package com.springboot.javaconfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 9:10
 */
public class UserDao {
    public List<User> queryUserList(){
        List<User> result = new ArrayList<>();
        //模拟数据库查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUsername("username_"+i);
            user.setPassword("password_"+i);
            user.setAge(i+1);
            result.add(user);
        }
        return result;
    }
}

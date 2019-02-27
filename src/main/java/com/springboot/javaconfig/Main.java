package com.springboot.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 9:25
 */
public class Main {
    public static void main(String[] args) {
        //通过Java配置来实例化Spring容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        //在Spring容器中获取bean对象
        UserService userService = context.getBean(UserService.class);
        //调用对象中的方法
        List<User> users = userService.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        //销毁该容器
        context.destroy();
    }
}

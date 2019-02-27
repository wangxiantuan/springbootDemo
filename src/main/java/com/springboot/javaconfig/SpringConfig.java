package com.springboot.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wangxiantuan
 * @create 2019/2/27 - 9:18
 */
@Configuration //通过注解来表明该类是一个Spring的配置，相当于xml文件
@ComponentScan(basePackages = "com.springboot.javaconfig")
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)
public class SpringConfig {
    @Value("${jdbc.url}")
    private String jdbcUrl;

    @Bean //通过该注解来表明是一个Bean对象，相当于xml中的<bean>
    public  UserDao getUserDao(){
        return new UserDao();
    }

}

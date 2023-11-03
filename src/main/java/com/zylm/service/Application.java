package com.zylm.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName Application
 * @Description 主启动类
 * @Author zy
 * @Date 2023/11/2 15:27
 * @Version 1.0
 */
@ComponentScan(basePackages = {"com.zylm"})
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("http://localhost:8081/zylm/swagger-ui.html");
        System.out.println("http://localhost:8081/zylm/doc.html#/home");
    }
}

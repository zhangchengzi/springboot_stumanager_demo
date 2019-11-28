package com.qf.springboot_stumanager_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootStumanagerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStumanagerDemoApplication.class, args);
    }

}

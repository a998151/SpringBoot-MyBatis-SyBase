package com.example.springbootcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.springbootcloud.mapper")
public class SpringbootcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcloudApplication.class, args);
    }
}

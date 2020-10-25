package com.kll.security;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@MapperScan("com.kll.security.dao")
@EnableJpaRepositories(basePackages = "com.kll.security.dao")
@EntityScan("com.kll.entities")
public class MyApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(com.kll.security.MyApplication.class);
        springApplication.run(args);
    }
}

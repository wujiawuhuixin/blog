package com.xin.blog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationStarter {
    protected static final Logger logger = LoggerFactory.getLogger(ApplicationStarter.class);
    public static void main(String[] args){
        logger.info("Spring Boot开始加载");
        SpringApplication.run(ApplicationStarter.class,args);
        logger.info("Spring Boot加载完成");
    }
}

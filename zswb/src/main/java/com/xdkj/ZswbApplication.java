package com.xdkj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xdkj.dao")
public class ZswbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZswbApplication.class, args);
    }

}

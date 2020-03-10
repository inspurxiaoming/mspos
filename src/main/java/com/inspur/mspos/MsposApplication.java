package com.inspur.mspos;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.inspur.mspos.**.dao")
public class MsposApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsposApplication.class, args);
    }

}

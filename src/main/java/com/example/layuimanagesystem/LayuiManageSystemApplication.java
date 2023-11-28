package com.example.layuimanagesystem;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
@MapperScan("com.example.layuimanagesystem.*.mapper")
public class LayuiManageSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LayuiManageSystemApplication.class, args);
        log.info("++++++++++++java启动+++++++++++");
    }


}

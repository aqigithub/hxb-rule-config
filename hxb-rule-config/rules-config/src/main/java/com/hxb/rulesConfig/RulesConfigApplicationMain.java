package com.hxb.rulesConfig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.ConditionalOnDiscoveryEnabled;

/**
 * @author: 小红红
 * @create: 2022-09-06 09:05
 * @description:
 **/
@SpringBootApplication
//扫描mapper所在的包
@MapperScan("com.hxb.rulesConfig.mapper")
public class RulesConfigApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(RulesConfigApplicationMain.class);
    }

}

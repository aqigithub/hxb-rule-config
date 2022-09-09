package com.hxb.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: 小红红
 * @create: 2022-09-07 12:24
 * @description: 网关启动类
 **/
@SpringBootApplication
public class GatewayApplicationMain {
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplicationMain.class);
    }
}

package com.chason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: chason
 * @Date: 2020/8/24 17:27
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class UserCenterApllication {
    public static void main(String[] args) {
        SpringApplication.run(UserCenterApllication.class, args);
    }
}

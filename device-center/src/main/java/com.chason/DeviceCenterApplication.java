package com.chason;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: chason
 * @Date: 2020/8/24 19:23
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DeviceCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeviceCenterApplication.class, args);
    }
}

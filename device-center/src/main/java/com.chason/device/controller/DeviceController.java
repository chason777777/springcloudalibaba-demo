package com.chason.device.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.chason.device.fallback.DeviceFallbackUtill;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chason
 * @Date: 2020/8/24 19:25
 * @Description:
 */
@RestController
@RequestMapping("/device")
public class DeviceController {
    @RequestMapping("/list")
    @SentinelResource(value="devicelist", fallbackClass = {DeviceFallbackUtill.class}, fallback = "handleException")
    public String list(String userUuid) {
        System.out.println("device controller list, userUuid -> " + userUuid);
        return "ddddddddddddddd";
    }
}

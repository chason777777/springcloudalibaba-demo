package com.chason.user.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: chason
 * @Date: 2020/8/24 20:18
 * @Description:
 */
@FeignClient(value = "device-center")
public interface DeviceFeign {
    @RequestMapping(value = "/device/list",method = RequestMethod.GET)
    String list(String userUuid);
}

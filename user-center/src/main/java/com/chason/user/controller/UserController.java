package com.chason.user.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.fastjson.JSONObject;
import com.chason.user.fallback.DeviceFallbackUtill;
import com.chason.user.feign.DeviceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: chason
 * @Date: 2020/8/24 16:07
 * @Description:
 */
@RestController
@RequestMapping("user")
@RefreshScope
public class UserController {
    @Autowired
    DeviceFeign deviceFeign;

    @Value("${servername:lily}")
    String serverservername;

    @RequestMapping("/list")
    @SentinelResource(value="userlist", fallbackClass = {DeviceFallbackUtill.class}, fallback = "handleException")
    public String list(){
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("code", 1);
        jsonObject.put("msg", "success");
        jsonObject.put("serverName", serverservername);

        String deviceStr = deviceFeign.list("qqqqqqqqqqqq");
        jsonObject.put("device", deviceStr);
//        throw new RuntimeException();
//        String str = null;
//        str.length();
        return jsonObject.toJSONString();
    }
}

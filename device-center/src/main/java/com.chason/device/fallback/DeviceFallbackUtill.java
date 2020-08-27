package com.chason.device.fallback;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @Author: chason
 * @Date: 2020/8/26 20:25
 * @Description:
 */
public final class DeviceFallbackUtill {
    public static void handleException(BlockException ex) {
        System.out.println("Oops: " + ex.getClass().getCanonicalName());
    }
}

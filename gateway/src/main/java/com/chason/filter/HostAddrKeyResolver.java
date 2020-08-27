package com.chason.filter;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author: chason
 * @Date: 2020/8/25 17:18
 * @Description:
 * 限流
 */
@Component
public class HostAddrKeyResolver implements KeyResolver{
    @Override
    public Mono<String> resolve(ServerWebExchange serverWebExchange) {
        return Mono.just(serverWebExchange.getRequest().getRemoteAddress().getAddress().getHostAddress());
    }
}

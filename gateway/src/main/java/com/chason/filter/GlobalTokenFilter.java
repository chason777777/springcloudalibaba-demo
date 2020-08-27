package com.chason.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @Author: chason
 * @Date: 2020/8/25 15:39
 * @Description:
 */
@Component
public class GlobalTokenFilter implements GlobalFilter, Ordered {
    Logger logger= LoggerFactory.getLogger( GlobalTokenFilter.class );

    @Override
    public Mono<Void> filter(ServerWebExchange serverWebExchange, GatewayFilterChain gatewayFilterChain) {
        String token = serverWebExchange.getRequest().getHeaders().getFirst("token");
        if (token == null || token.isEmpty()) {
            logger.info( "token is empty..." );
            serverWebExchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
            return serverWebExchange.getResponse().setComplete();
        }
        return gatewayFilterChain.filter(serverWebExchange);
    }

    @Override
    public int getOrder() {
        return -100;
    }
}

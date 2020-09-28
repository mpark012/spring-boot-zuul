package com.leadingcompass.filters;

import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


public class RoutingAndFilteringGatewayApplication {
    @Bean
    public PreSimpleFilter simpleFilter() {
        return new PreSimpleFilter();
    }
}
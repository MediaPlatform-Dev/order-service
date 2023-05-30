package com.k1m743hyun.orderservice.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@EnableFeignClients(basePackages = "com.k1m743hyun.orderservice.client")
@Configuration
public class FeignClientConfig {

}

package com.yun.cms.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient//扫描Fegin的代理
@SpringBootApplication
public class GateWayAppliaction {
    public static void main(String[] args) {
        SpringApplication.run(GateWayAppliaction.class, args);
    }
}

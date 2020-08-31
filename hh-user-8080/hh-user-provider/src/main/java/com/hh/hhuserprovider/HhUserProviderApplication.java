package com.hh.hhuserprovider;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "com.hh.service")
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan(basePackages = "com.hh")
@EnableApolloConfig
public class HhUserProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhUserProviderApplication.class, args);
    }

}

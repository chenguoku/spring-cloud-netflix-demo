package com.hh.hhgoodsprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = "com.hh.service")
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.hh")
@SpringBootApplication
public class HhGoodsProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhGoodsProviderApplication.class, args);
    }

}

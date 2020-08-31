package com.hh.hhcloudgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HhCloudGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HhCloudGatewayApplication.class, args);
    }

}

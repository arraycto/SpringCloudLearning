package com.moxuanran.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 莫轩然
 * @date 2020/7/15 11:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderDemoApplication.class, args);
    }
}

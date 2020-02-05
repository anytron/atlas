package com.atlas.eureka.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description Eureka服务
 * @className EurekaApplication
 * @author anytron
 * @date 2020年2月5日下午8:13:13
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication
//创建服务注册中心
public class EurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}

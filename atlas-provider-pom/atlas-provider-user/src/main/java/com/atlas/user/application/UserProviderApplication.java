package com.atlas.user.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description user服务提供者启动器
 * @className UserProviderApplication
 * @author anytron
 * @date 2020年2月5日下午9:10:31
 * @version 1.0
 */
@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"com.atlas.user.controller"})
public class UserProviderApplication {
	public static void main(String[] args) {
		SpringApplication.run(UserProviderApplication.class, args);
	}
}

package com.atlas.client.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description 消费者客户端启动器
 * @className ClientApplication
 * @author anytron
 * @date 2020年2月5日下午10:31:44
 * @version 1.0
 */
@EnableHystrix
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atlas.client.feign")
@SpringBootApplication(
		scanBasePackages = {"com.atlas.client.controller","com.atlas.client.feign","com.atlas.client.config"},
		exclude = DataSourceAutoConfiguration.class )//忽略数据库启动
public class ClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientApplication.class, args);
	}
}

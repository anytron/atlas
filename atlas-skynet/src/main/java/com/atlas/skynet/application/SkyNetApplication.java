package com.atlas.skynet.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.atlas.skynet.zuul.filter.AccessUserNameFilter;

/**
 * @description 网关服务启动器
 * @className SkyNetApplication
 * @author anytron
 * @date 2020年2月6日上午1:01:04
 * @version 1.0
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class )
public class SkyNetApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkyNetApplication.class, args);
    }
    
    @Bean
    public AccessUserNameFilter accessUserNameFilter(){
    	return new AccessUserNameFilter();
    }
}

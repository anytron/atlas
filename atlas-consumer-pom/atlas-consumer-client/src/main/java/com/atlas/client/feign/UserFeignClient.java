package com.atlas.client.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.atlas.api.user.IUserProviderService;
import com.atlas.client.feign.fallback.UserFeignFallBack;

//多个一样的时候application.yml 添加 spring: main: allow-bean-definition-overriding: true 允许覆盖
@FeignClient(value = "atlas-provider-user",fallback = UserFeignFallBack.class)
public interface UserFeignClient extends IUserProviderService {}

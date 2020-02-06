package com.atlas.client.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.atlas.api.user.IDemoProviderService;
import com.atlas.client.feign.fallback.DemoFeignFallBack;
//多个一样的时候application.yml 添加 spring: main: allow-bean-definition-overriding: true
@FeignClient(value = "atlas-provider-user", fallback = DemoFeignFallBack.class)
public interface DemoFeignClient extends IDemoProviderService {
}

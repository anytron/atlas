package com.atlas.client.feign;

import org.springframework.cloud.openfeign.FeignClient;

import com.atlas.api.user.IDemoProviderService;
import com.atlas.client.feign.fallback.DemoFeignFallBack;

@FeignClient(value = "atlas-provider-user", fallback = DemoFeignFallBack.class)
public interface DemoFeignService extends IDemoProviderService {}

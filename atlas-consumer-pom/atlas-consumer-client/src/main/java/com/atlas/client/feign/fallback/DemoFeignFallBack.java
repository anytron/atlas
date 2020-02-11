package com.atlas.client.feign.fallback;

import org.springframework.stereotype.Component;

import com.atlas.client.feign.DemoFeignClient;

@Component
public class DemoFeignFallBack implements DemoFeignClient {

	@Override
	public String getServerPort() {
		return "ERROR";
	}

	@Override
	public String sayName(String name) {
		return "ERROR";
	}
	
}

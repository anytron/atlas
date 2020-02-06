package com.atlas.client.feign.fallback;

import org.springframework.stereotype.Service;

import com.atlas.client.feign.DemoFeignClient;

@Service
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

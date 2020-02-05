package com.atlas.client.feign.fallback;

import org.springframework.stereotype.Service;

import com.atlas.client.feign.DemoFeignService;

@Service
public class DemoFeignFallBack implements DemoFeignService {

	@Override
	public String getServerPort() {
		return "error";
	}

	@Override
	public String sayName(String name) {
		return "error";
	}

}

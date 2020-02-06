package com.atlas.client.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.client.feign.DemoFeignClient;

@RestController
public class DemoController {
	
	@Autowired
    private DemoFeignClient demoFeignClient;
	
	@GetMapping("/getPort")
	public String getPort() {
		return demoFeignClient.getServerPort();
	}
	
	@GetMapping("/sayMyName")
	public String sayMyName(String name) {
		return demoFeignClient.sayName(name);
	}
	
}

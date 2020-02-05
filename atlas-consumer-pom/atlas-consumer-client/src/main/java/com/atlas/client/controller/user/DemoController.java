package com.atlas.client.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.client.feign.DemoFeignService;

@RestController
public class DemoController {
	
	@Autowired
	DemoFeignService demoFeignService;
	
	@GetMapping("/getPort")
	public String getPort() {
		return demoFeignService.getServerPort();
	}
	
	@GetMapping("/sayMyName")
	public String sayMyName(String name) {
		return demoFeignService.sayName(name);
	}
	
}

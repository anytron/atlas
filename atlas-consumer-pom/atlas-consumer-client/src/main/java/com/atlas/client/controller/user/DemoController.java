package com.atlas.client.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.client.feign.UserFeignService;

@RestController
public class DemoController {
	
	@Autowired
	UserFeignService userFeignService;
	
	@GetMapping("/getPort")
	public String getPort() {
		return userFeignService.getServerPort();
	}
	
	@GetMapping("/sayMyName")
	public String sayMyName(String name) {
		return userFeignService.sayName(name);
	}
	
}

package com.atlas.client.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.client.feign.DemoFeignClient;
import com.atlas.model.ErrorCode;
import com.atlas.model.Result;

@RestController
public class DemoController {
	
	@Autowired
    private DemoFeignClient demoFeignClient;
	
	@GetMapping("/getPort")
	public Result<String> getPort() {
		String serverPort = demoFeignClient.getServerPort();
		if ("ERROR".equals(serverPort)) {//如果提供者有问题则会启动断容器
			return new Result<>(ErrorCode.PROVIDER_ERROR);
		}
		return new Result<>(ErrorCode.SUCCESS,serverPort);
	}
	
	@GetMapping("/sayMyName")
	public Result<String> sayMyName(String name) {
		String sayName = demoFeignClient.sayName(name);
		if ("ERROR".equals(sayName)) {
			return new Result<>(ErrorCode.PROVIDER_ERROR);
		}
		return new Result<>(ErrorCode.SUCCESS,sayName);
	}
	
}

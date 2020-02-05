package com.atlas.user.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.api.user.IDemoProviderService;

@RestController
public class DemoController implements IDemoProviderService {
	
	@Value("${server.port}")
    private String serverPort;

	@Override
	public String getServerPort() {
		return "server port is : "+serverPort;
	}

	@Override
	public String sayName(String name) {
		return "my name is "+name;
	}
	
	
	
	
}

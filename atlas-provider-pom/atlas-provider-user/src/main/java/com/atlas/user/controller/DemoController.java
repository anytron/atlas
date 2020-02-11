package com.atlas.user.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.api.user.IDemoProviderService;

@RestController
public class DemoController implements IDemoProviderService {
	
	private static Logger logger = LogManager.getLogger(DemoController.class);
	
	@Value("${server.port}")
    private String serverPort;

	@Override
	public String getServerPort() {
		return "server port is : "+serverPort;
	}

	@Override
	public String sayName(String name) {
		try {
			
			//制造异常
			int a = 2;
			int b = 0;
			int c = a /b;
			logger.info(c);
		} catch (Exception e) {
			throw e;
		}
		
		return "my name is "+name;
	}
	
	
	
	
}

package com.atlas.api.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface IDemoProviderService {

	@GetMapping("/demo/getServerPort")
    public String getServerPort();
	
	
	@GetMapping("/demo/sayName")
	public String sayName(@RequestParam("name") String name);
} 

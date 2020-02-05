package com.atlas.client.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.client.feign.UserFeignService;
import com.atlas.model.Result;
import com.atlas.model.user.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserFeignService userFeignService;
	
	@GetMapping("/get-user-by-id")
	public Result<User> getUserById(Long id) {
		return userFeignService.getUserById(id);
	}
	
	@GetMapping("/get-all-user")
	public Result<List<User>> getAllUser() {
		return userFeignService.getAllUser();
	}

	@PostMapping("/add-user")
	public Result<String> addUser(User user) {
		return userFeignService.addUser(user);
	}

	@PostMapping("/update-user")
	public Result<String> updateUser(User user) {
		return userFeignService.updateUser(user);
	}

	@PostMapping("/delete-user")
	public Result<String> deleteUserById(Long id) {
		return userFeignService.deleteUserById(id);
	}
	
	
	
}

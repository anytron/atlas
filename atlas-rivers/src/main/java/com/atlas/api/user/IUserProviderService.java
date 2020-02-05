package com.atlas.api.user;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.atlas.model.Result;
import com.atlas.model.user.User;

public interface IUserProviderService {
	
	// c新增 r读取 u更新 d删除
	
	@GetMapping("/user/r/getUserById")
    public Result<User> getUserById(@RequestParam("id") Long id);
	
	@GetMapping("/user/r/getAllUser")
	public Result<List<User>> getAllUser();
	
	@PostMapping("/user/c/addUser")
	public Result<String> addUser(@RequestBody User user);
	
	@PostMapping("/user/u/updateUser")
	public Result<String> updateUser(@RequestBody User user);
	
	@PostMapping("/user/d/deleteUserById")
	public Result<String> deleteUserById(@RequestParam("id") Long id);
	
} 

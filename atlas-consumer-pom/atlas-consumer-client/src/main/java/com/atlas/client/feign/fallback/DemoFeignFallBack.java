package com.atlas.client.feign.fallback;

import java.util.List;

import org.springframework.stereotype.Service;

import com.atlas.client.feign.UserFeignService;
import com.atlas.model.ErrorCode;
import com.atlas.model.Result;
import com.atlas.model.user.User;

@Service
public class DemoFeignFallBack implements UserFeignService {

	@Override
	public String getServerPort() {
		return "error";
	}

	@Override
	public String sayName(String name) {
		return "error";
	}

	@Override
	public Result<User> getUserById(Long id) {
		return new Result<User>(ErrorCode.UNKNOWN_ERROR);
	}

	@Override
	public Result<List<User>> getAllUser() {
		return new Result<List<User>>(ErrorCode.UNKNOWN_ERROR);
	}

	@Override
	public Result<String> addUser(User user) {
		return new Result<String>(ErrorCode.UNKNOWN_ERROR);
	}

	@Override
	public Result<String> updateUser(User user) {
		return new Result<String>(ErrorCode.UNKNOWN_ERROR);
	}

	@Override
	public Result<String> deleteUserById(Long id) {
		return new Result<String>(ErrorCode.UNKNOWN_ERROR);
	}

}

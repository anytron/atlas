package com.atlas.user.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.atlas.api.user.IUserProviderService;
import com.atlas.model.ErrorCode;
import com.atlas.model.Result;
import com.atlas.model.user.User;
import com.atlas.user.service.IUserService;

@RestController
public class UserController implements IUserProviderService {

	private static Logger logger = LogManager.getLogger(UserController.class);

	@Autowired
	IUserService userService;

	@Override
	public Result<User> getUserById(Long id) {
		Result<User> result = new Result<User>();
		try {
			if (id == null || id == 0L) {
				result.instanceResult(ErrorCode.USER_ID_EMPTY_ERROR);
			} else {
				User user = userService.getUserById(id);
				result.instanceResult(ErrorCode.SUCCESS, user);
			}
		} catch (Exception e) {
			result.instanceResult(ErrorCode.SYS_ERROR);
			logger.error(result.getDesc(), e);
		}
		return result;
	}

	@Override
	public Result<List<User>> getAllUser() {
		Result<List<User>> result = new Result<List<User>>();
		try {
			List<User> users = userService.getAllUser();
			result.instanceResult(ErrorCode.SUCCESS, users);
		} catch (Exception e) {
			result.instanceResult(ErrorCode.SYS_ERROR);
			logger.error(result.getDesc(), e);
		}
		return result;
	}

	@Override
	public Result<String> addUser(User user) {
		Result<String> result = new Result<String>();
		try {
			userService.addUser(user);
			result.instanceResult(ErrorCode.SUCCESS);
		} catch (Exception e) {
			result.instanceResult(ErrorCode.SYS_ERROR);
			logger.error(result.getDesc(), e);
		}
		return result;
	}

	@Override
	public Result<String> updateUser(User user) {
		Result<String> result = new Result<String>();
		try {
			if (user.getId() == null || user.getId() == 0L) {
				result.instanceResult(ErrorCode.USER_ID_EMPTY_ERROR);
			} else {
				userService.updateUser(user);
				result.instanceResult(ErrorCode.SUCCESS);
			}
		} catch (Exception e) {
			result.instanceResult(ErrorCode.SYS_ERROR);
			logger.error(result.getDesc(), e);
		}
		return result;
	}

	@Override
	public Result<String> deleteUserById(Long id) {
		Result<String> result = new Result<String>();
		try {
			if (id == null || id == 0L) {
				result.instanceResult(ErrorCode.USER_ID_EMPTY_ERROR);
			} else {
				userService.deleteUserById(id);
				result.instanceResult(ErrorCode.SUCCESS);
			}
		} catch (Exception e) {
			result.instanceResult(ErrorCode.SYS_ERROR);
			logger.error(result.getDesc(), e);
		}
		return result;
	}

}

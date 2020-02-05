package com.atlas.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atlas.model.user.User;
import com.atlas.user.mapper.UserMapper;
import com.atlas.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
	
	@Autowired
	UserMapper userMapper;

	@Override
	public User getUserById(Long id) {
		return userMapper.selectByPrimaryKey(id);
	}
	
	@Override
	public List<User> getAllUser() {
		return userMapper.selectAll();
	}

	@Override
	public int addUser(User user) {
		return userMapper.insertSelective(user);
	}

	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public int deleteUserById(Long id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	
	
}

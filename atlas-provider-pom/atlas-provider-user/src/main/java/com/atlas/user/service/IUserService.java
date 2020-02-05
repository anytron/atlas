package com.atlas.user.service;

import java.util.List;

import com.atlas.model.user.User;

public interface IUserService {

	User getUserById(Long id);

	List<User> getAllUser();
	
	int addUser(User user);

	int updateUser(User user);

	int deleteUserById(Long id);


}

package com.codegnan.service;

import java.util.List;

import com.codegnan.model.User;

public interface UserService {

	public User addUser(User user);
	public User findByUserId(Integer userId);
	public List<User> findAllUser();
	public User updateUser(Integer userId, User user);
	public void deleteUser(Integer userId);
}

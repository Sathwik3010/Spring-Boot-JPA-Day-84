package com.codegnan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.codegnan.model.User;
import com.codegnan.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	private UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findByUserId(Integer userId) {
		return userRepository.findById(userId).orElseThrow(()-> 
		new RuntimeException("User Not found in DB"));
	}

	@Override
	public List<User> findAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(Integer userId, User user) {
		User dbUser = findByUserId(userId);
		dbUser.setFirstName(user.getFirstName());
		dbUser.setLastName(user.getLastName());
		dbUser.setEmail(user.getEmail());
		dbUser.setPhone(user.getPhone());
		return userRepository.save(dbUser);
	}

	@Override
	public void deleteUser(Integer userId) {
		User user = findByUserId(userId);
		userRepository.delete(user);
		System.out.println("User with "+userId+" Deleted Successfully");
	}
	
}

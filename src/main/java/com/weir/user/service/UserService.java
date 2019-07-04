package com.weir.user.service;

import org.springframework.stereotype.Service;

import com.weir.user.entity.User;

@Service
public class UserService {

	// @Autowired
	// private UserMapper userMapper;

	public User findUserById(Long id) {
		// return userMapper.selectById(id);
		return new User();
	}

}

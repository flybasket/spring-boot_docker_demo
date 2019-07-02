package com.weir.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weir.user.entity.User;
import com.weir.user.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public User findUserById (Long id){
		return userMapper.selectById(id);
	}
	
}

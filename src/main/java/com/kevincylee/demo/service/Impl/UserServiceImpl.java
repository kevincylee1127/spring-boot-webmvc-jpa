package com.kevincylee.demo.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kevincylee.demo.dao.UserDao;
import com.kevincylee.demo.entity.User;
import com.kevincylee.demo.service.UserService;

/**
 * ClassName: UserServiceImpl
 * 
 * @author Chen Yuan Lee (Kevin)
 * @version 1.0
 * @createTime: 2018/07/15 20:42:52
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDao dao;

	@Override
	public List<User> findAll() {
		return dao.findAll();
	}

}

package com.shy.ssm.service.impl;

import com.shy.ssm.bean.User;
import com.shy.ssm.dao.UserDao;
import com.shy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:45
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;

	@Override
	public User get(Integer id) {
		System.out.println(id);
		return userDao.get(id);
	}

	@Override
	public List<User> list() {
		List<User> list = userDao.list();
		System.out.println(list);
		return list;

	}

	@Override
	public void add(User user) {
		userDao.add(user);
	}
}

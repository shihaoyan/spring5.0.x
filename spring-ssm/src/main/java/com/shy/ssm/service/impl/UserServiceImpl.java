package com.shy.ssm.service.impl;

import com.shy.ssm.bean.User;
import com.shy.ssm.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:45
 * 描述：
 */
@Service
public class UserServiceImpl implements UserService {
	@Override
	public User get(Integer id) {
		System.out.println("service层执行成功");
		return null;
	}

	@Override
	public List<User> list() {
		System.out.println("service层执行成功");
		return null;
	}
}

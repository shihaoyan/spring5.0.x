package com.shy.ssm.service;

import com.shy.ssm.bean.User;

import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:43
 * 描述：
 */
public interface UserService {
	/**
	 * 获取用户
	 *
	 * @param id
	 * @return
	 */
	User get(Integer id);

	/**
	 * 获取所有的用户
	 *
	 * @return
	 */
	List<User> list();

	/**
	 * 添加用户信息
	 * @param user
	 */
	void add(User user);
}

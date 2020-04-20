package com.shy.ssm.dao;

import com.shy.ssm.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 石皓岩
 * @create 2020-03-04 7:48
 * 描述：
 */
@Component
public class UserDao {
	/**
	 * 模拟数据
	 */
	private List<User> data = new ArrayList<>();
	{

		data.add(new User(1, "aaa", "aaa"));
		data.add(new User(2, "bbb", "bbb"));
		data.add(new User(3, "bbb", "bbb"));
		data.add(new User(4, "bbb", "bbb"));
		data.add(new User(5, "ccc", "ccc"));
		data.add(new User(6, "ddd", "ddd"));
		data.add(new User(7, "eee", "eee"));
		data.add(new User(8, "fff", "fff"));
	}

	/**
	 * 通过i获取数据
	 * @param id
	 * @return
	 */
	public User get(Integer id){
		for (User user : data) {
			if(user.getId() == id){
				return user;
			}
		}
		return null;

	}
	/**
	 * 获取全部数据
	 */
	public List<User> list(){
		return data;
	}

	/**
	 * 更新用户信息
	 * @param user
	 */
	public void update(User user){
		User user1 = data.get(user.getId());
		if(user.getUsername()!=null && !"".equals(user.getUsername())){
			user1.setUsername(user.getUsername());
		}
		if(!StringUtils.isEmpty(user.getPassword())){
			user1.setPassword(user.getPassword());
		}
	}

	/**
	 * 添加用户信息
	 * @param user
	 */
	public void add(User user){
		data.add(user);
	}


}

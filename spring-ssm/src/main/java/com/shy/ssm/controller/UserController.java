package com.shy.ssm.controller;

import com.shy.ssm.bean.User;
import com.shy.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:42
 * 描述：
 */
@Controller
public class UserController {
	/**
	 * 用户服务接口
	 */
	@Autowired
	private UserService userService;

	@RequestMapping("/list")
	@ResponseBody
	public User list() {
		List<User> list = userService.list();
		Map<String,Object> map = new HashMap<>();
		map.put("user",new User(1,"aaa","2222"));
		return new User(1,"aaa","2222");
	}

}

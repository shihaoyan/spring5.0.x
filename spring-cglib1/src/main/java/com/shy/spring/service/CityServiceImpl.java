package com.shy.spring.service;

import org.springframework.stereotype.Service;

/**
 * @author 石皓岩
 * @create 2020-01-12 23:19
 * 描述：
 */
@Service
public class CityServiceImpl implements CityService{

	public String queryCity(){
		System.out.println("service层执行成功");
		return "ok";
	}

}

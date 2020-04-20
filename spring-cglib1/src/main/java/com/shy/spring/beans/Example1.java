package com.shy.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 石皓岩
 * @create 2020-01-13 13:07
 * 描述：
 */
@Component
public class Example1 {

	@Autowired
	private Example2 example2;


	public Example2 getExample2(){
		return example2;
	}


	public Object testAspectJ(String name){
		return name;
	}



}

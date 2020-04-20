package com.shy.ssm;

import com.shy.ssm.bean.User;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.DataBinder;

/**
 * @author 石皓岩
 * @create 2020-03-01 21:56
 * 描述：
 */
public class App_Main {
	public static void main(String[] args) {
		User user = new User();
		DataBinder binder = new DataBinder(user, "user");
		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.add("id", 9);
		pvs.add("username", "小明");
		pvs.add("password", "123456");
		//这个时候就已经进行了注入
		binder.bind(pvs);
		System.out.println(user);
	}
}

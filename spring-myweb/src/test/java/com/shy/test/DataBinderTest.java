package com.shy.test;

import com.shy.ssm.bean.User;
import org.junit.Test;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.validation.BindException;
import org.springframework.validation.DataBinder;

import java.util.Map;

/**
 * @author 石皓岩
 * @create 2020-03-06 12:26
 * 描述：
 */
public class DataBinderTest {
	@Test
	public void test() throws BindException {
		User user = new User();
		DataBinder binder = new DataBinder(user, "user");
		MutablePropertyValues pvs = new MutablePropertyValues();
		pvs.add("id", 9);
		pvs.add("username", "小明");
		pvs.add("password", "123456");
		binder.bind(pvs);
		Map<?, ?> close = binder.close();
		System.out.println(user);
		System.out.println(close);
	}
}

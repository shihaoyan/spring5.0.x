package com.shy.spring.factoryconfig;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @author 石皓岩
 * @create 2020-01-21 21:58
 * 描述：这个是将要替换成的方法
 */
//@Component
public class MyMethodReplacer implements MethodReplacer {
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) {
		System.out.println(obj);
		System.out.println(method.getName());
		System.out.println(args);
		return obj;
	}
}

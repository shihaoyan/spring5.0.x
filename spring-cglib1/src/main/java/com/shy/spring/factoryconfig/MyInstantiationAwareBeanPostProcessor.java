package com.shy.spring.factoryconfig;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @author 石皓岩
 * @create 2020-02-08 20:29
 * 描述：最后一次更改bean的机会，返回true表示继续进行自动注入
 *		返回false表示不进行自动注入直接返回
 */
//@Component
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

		return true;


	}
}

package com.shy.spring;

import com.shy.spring.config.AppConfig;
import com.shy.spring.service.CityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 石皓岩
 * @create 2020-01-12 23:18
 * 描述：
 */
public class App_Main {
	private static ApplicationContext ac = null;

	public static void main(String[] args) {
		/**
		 * 基于注解的方式初始化context(环境、上下文、容器)
		 */
		AnnotationConfigApplicationContext acac = new AnnotationConfigApplicationContext(AppConfig.class);
		CityService cityService = acac.getBean(CityService.class);
		cityService.queryCity();
		System.out.println(cityService instanceof CityService);
	}
}

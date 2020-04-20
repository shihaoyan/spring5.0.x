package com.shy.ssm.handlermapping;

import org.springframework.core.Ordered;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author 石皓岩
 * @create 2020-03-04 13:47
 * 描述：
 */
//@Component
public class MyHandlerMapping implements HandlerMapping , Ordered {
	@Override
	public HandlerExecutionChain getHandler(HttpServletRequest request) {


		String s = request.getRequestURI();
		System.out.println(s);

		return null;
	}

	/**
	 * 这个接口是spring提供的排序接口，当这个值越小说明这个这个越先被调用或者初始化
	 * 如果说我们自己定义了一个HandlerMapping但是没有设置这个值的话，他会排序到最后
	 * 所以说当你不想使用默认的RequestMapping，你可以先默认使用这个，并且值设置为0，
	 * 但是还需要注意的是，因为springmvc的hanflermapping会通过WebMvcConfiguration
	 * WebMvcConfigurationSupport所Import导入进来的，所以说能，你想让它先于RequestMapping执行
	 * 就需要先把它通过springmvc进行扫描，为什么呢？因为如果spring容器进行扫描的话，这个类会实例化在
	 * 父容器种，而spring会先调用当前容器，所以说必须spring进行扫描，并且还要在Import注入之前，所以说只能扫描
	 * 并且放在controlelr包中
	 * @return
	 */
	@Override
	public int getOrder() {
		return 0;
	}
}

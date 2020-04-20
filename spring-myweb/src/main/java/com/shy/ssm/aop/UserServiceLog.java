package com.shy.ssm.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 石皓岩
 * @create 2020-03-05 16:35
 * 描述：
 */
@Component
@Aspect
public class UserServiceLog {

	@Pointcut("execution(* com.shy.ssm.service.impl.UserServiceImpl.*(..))")
	public void userService() {

	}


	@Around("userService()")
	public Object aroundLog(ProceedingJoinPoint pj) {
		System.out.println("service执行查询之前");
		Object o = null;
		try {
			o = pj.proceed();
		}catch (Throwable e){
			e.printStackTrace();
		}
		System.out.println("service执行查询之后");
		return o;
	}


}

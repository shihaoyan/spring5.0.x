package com.shy.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 石皓岩
 * @create 2020-02-12 15:00
 * 描述：
 */
@Aspect
@Component
public class AspectJTest {

	@Pointcut("execution(* *.queryCity*(..))")
	public void test() {

	}

	@Before("test()")
	public void beaforeTest() {
		System.out.println("before");
	}

	@After("test()")
	public void afterTest() {
		System.out.println("after");
	}


	@Around("test()")
	public Object aroundTest(ProceedingJoinPoint pj) {
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

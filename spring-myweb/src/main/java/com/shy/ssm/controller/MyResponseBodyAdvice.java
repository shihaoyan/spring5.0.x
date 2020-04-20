package com.shy.ssm.controller;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author 石皓岩
 * @create 2020-03-07 19:34
 * 描述：
 */
//@ControllerAdvice
public class MyResponseBodyAdvice<T> implements ResponseBodyAdvice<T> {


	@Override
	public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
		System.out.println(returnType + "==" + converterType);
		return true;
	}

	@Override
	public T beforeBodyWrite(T body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
		System.out.println(body + "--" + returnType + "---" + request + "----" + "---" + response);
		return body;
	}
}

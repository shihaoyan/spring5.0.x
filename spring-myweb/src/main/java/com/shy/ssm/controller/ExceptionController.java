package com.shy.ssm.controller;

import com.shy.ssm.bean.MsgResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 石皓岩
 * @create 2020-03-09 17:26
 * 描述：
 */
@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(Exception.class)
	@ResponseBody
	public MsgResult handleException(Exception ex){
		System.out.println("出现异常信息");
		ex.printStackTrace();
		return new MsgResult(1,"出现错误",new Object());
	}

}

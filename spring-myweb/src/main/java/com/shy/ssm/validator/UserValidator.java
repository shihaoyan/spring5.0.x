package com.shy.ssm.validator;

import com.shy.ssm.bean.User;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * @author 石皓岩
 * @create 2020-03-06 13:37
 * 描述：
 */
//@Component  //如果想使用他，必须添加到@InitBinder注解标注的类，并且进行注册
public class UserValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return User.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		User user = (User) target;
		if(user.getId() > 5){
			errors.rejectValue("id","必须大于5");
		}
	}
}

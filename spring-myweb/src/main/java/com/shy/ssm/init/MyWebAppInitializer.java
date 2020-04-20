package com.shy.ssm.init;

import com.shy.ssm.config.AppConfig;
import com.shy.ssm.config.RootConfig;

/**
 * @author 石皓岩
 * @create 2020-03-03 9:07
 * 描述：
 */
public class MyWebAppInitializer {
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[]{RootConfig.class};
	}

	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[]{AppConfig.class};
	}

	protected String[] getServletMappings() {
		return new String[]{"/"};
	}

}

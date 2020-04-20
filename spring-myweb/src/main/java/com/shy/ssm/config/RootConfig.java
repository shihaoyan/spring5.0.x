package com.shy.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author 石皓岩
 * @create 2020-03-03 9:08
 * 描述：
 */
@Configuration
@ComponentScan(basePackages = "com.shy.ssm",
		excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
				classes = {Controller.class, EnableWebMvc.class})})
@EnableAspectJAutoProxy
public class RootConfig {

}

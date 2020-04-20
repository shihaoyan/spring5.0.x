package com.shy.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author 石皓岩
 * @create 2020-03-02 16:00
 * 描述：
 */
@Configuration
@ComponentScan(basePackages = "com.shy.ssm",
		excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION,
				classes = {Controller.class}), useDefaultFilters = false)
public class RootConfig {
}

package com.shy.ssm.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:40
 * 描述：
 */
@Configuration
@ComponentScan("com.shy.ssm")
public class WebConfig implements WebMvcConfigurer {


}

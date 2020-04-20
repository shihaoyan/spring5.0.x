package com.shy.spring.config;

import com.shy.spring.factoryconfig.MyBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 石皓岩
 * @create 2020-01-12 23:18
 * 描述：
 */
@ComponentScan(basePackages = "com.shy.spring",nameGenerator = MyBeanNameGenerator.class)
@Configuration
@EnableAspectJAutoProxy
public class AppConfig {


}

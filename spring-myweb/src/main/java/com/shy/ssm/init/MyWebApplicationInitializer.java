package com.shy.ssm.init;

import com.shy.ssm.config.AppConfig;
import com.shy.ssm.config.RootConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import java.util.EnumSet;

/**
 * @author 石皓岩
 * @create 2020-03-01 19:59
 * 描述：
 */
public class MyWebApplicationInitializer implements WebApplicationInitializer {

	private static final String LOCATION = "C:/temp/"; // Temporary location where files will be stored

	private static final long MAX_FILE_SIZE = 5242880; // 5MB : Max file size.
	// Beyond that size spring will throw exception.
	private static final long MAX_REQUEST_SIZE = 20971520; // 20MB : Total request size containing Multi part.

	private static final int FILE_SIZE_THRESHOLD = 0; // Size threshold after which files will be written to disk

	@Override
	public void onStartup(ServletContext servletContext) {
		//先注册RootConfig.class
		AnnotationConfigWebApplicationContext rootAppContext = new AnnotationConfigWebApplicationContext();
		//我们也可以直接让spring接在mvc的配置文件，但是这样的话逻辑比较混乱了
		rootAppContext.register(RootConfig.class);
		//注册spring的监听器
		ContextLoaderListener listener = new ContextLoaderListener(rootAppContext);
		//listener.setContextInitializers(null);
		servletContext.addListener(listener);
		// 开始注册springmvc
		// 其实这样写我是为了更加明确什么时候执行什么操作，其实我们都用之前创建的一个spring容器就可以了，
		// spring就会进行所有的扫描了，
		// 其实对于spring来说，你先要配置springmvc主要就是配置spring的监听器，配置完监听器之后，所有的功能都好事了
		AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
		ac.register(AppConfig.class);
		DispatcherServlet servlet = new DispatcherServlet(ac);
		//servlet.setContextInitializers(null);
		//添加根servlet
		ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
		registration.setLoadOnStartup(1);
		registration.addMapping("/");
		//配置文件上传
		// 这种方式是使用servlet3.0特性的文件上传
		// 当你想使用这种方式的时候你就必须要配置multipartResolver
		registration.setMultipartConfig(getMultipartConfigElement());


		// 添加pso编码过滤器
		// 这个里面跟踪源码会发现其实 两个boolen值就是为request和response设置编码的
		CharacterEncodingFilter filter = new CharacterEncodingFilter("UTF-8", true, true);
		FilterRegistration.Dynamic encodingFilter = servletContext.addFilter("encodingFilter", filter);
		encodingFilter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/*");

	}

	// 配置文件上传
	private MultipartConfigElement getMultipartConfigElement() {
		MultipartConfigElement multipartConfigElement = new MultipartConfigElement(LOCATION, MAX_FILE_SIZE, MAX_REQUEST_SIZE, FILE_SIZE_THRESHOLD);
		return multipartConfigElement;
	}
}

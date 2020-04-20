package com.shy.ssm.init;

import com.shy.ssm.config.WebConfig;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.Server;
import org.apache.catalina.Wrapper;
import org.apache.catalina.startup.Tomcat;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import java.io.File;

/**
 * @author 石皓岩
 * @create 2020-03-01 20:11
 * 描述：
 */
public class MyApplicationContext {
	public static void run() {
		//指定tomcat的工作目录
		//是操作系统的临时目录
		File base = new File(System.getProperty("java.io.tmpdir"));
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(80);

		//告诉tomcat我是一个web项目
		//如果你想加入下一行代码，你就必须搞一个jsp依赖
		//tomcat.addWebapp("/",base.getAbsolutePath());
		//这个其实就是发布项目
		tomcat.addContext("/",base.getAbsolutePath());

		try {
			//启动tomcat
			tomcat.start();
			Server server = tomcat.getServer();
			AnnotationConfigWebApplicationContext ac = new AnnotationConfigWebApplicationContext();
			ac.register(WebConfig.class);
			ac.refresh();

			DispatcherServlet servlet = new DispatcherServlet(ac);
			//ServletRegistration.Dynamic registration = servletContext.addServlet("app", servlet);
			//registration.setLoadOnStartup(1);
			//registration.addMapping("/");

			Wrapper wrapper = tomcat.addServlet("/", "app", servlet);
			wrapper.setLoadOnStartup(1);
			wrapper.addMapping("/");
			tomcat.getServer().await();
		} catch (LifecycleException e) {
			e.printStackTrace();
		}

	}
}

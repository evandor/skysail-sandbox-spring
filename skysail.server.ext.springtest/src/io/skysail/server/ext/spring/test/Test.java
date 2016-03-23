package io.skysail.server.ext.spring.test;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Component
public class Test {

	public Test() {
	}
	
	@Activate
	public void activate (ComponentContext ctx) {
		DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
		BundleAwareAnnotationConfigApplicationContext springAppContext = new BundleAwareAnnotationConfigApplicationContext(ctx, HelloWorldConfig.class);
//		AnnotationConfigApplicationContext springAppContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = springAppContext.getBean(HelloWorld.class);

		helloWorld.setMessage("Hello World!");
		helloWorld.getMessage();
	}
}

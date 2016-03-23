package io.skysail.server.ext.spring.test;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;

public class BundleAwareClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

	public BundleAwareClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry) {
		super(registry);
	}

}

package io.skysail.server.ext.spring.test;

import org.springframework.beans.factory.annotation.AnnotatedGenericBeanDefinition;
import org.springframework.core.type.AnnotationMetadata;

public class BundleAwareAnnotatedGenericBeanDefinition extends AnnotatedGenericBeanDefinition {

	public BundleAwareAnnotatedGenericBeanDefinition(Class<?> annotatedClass) {
		super(annotatedClass);
	}

}

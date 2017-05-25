package com.iqmsoft.spring.aspects.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE })
public @interface Retry {
	int attempts() default 4;
	long timeout() default 2000;
	Class<?> exceptionClass() default Throwable.class;
}